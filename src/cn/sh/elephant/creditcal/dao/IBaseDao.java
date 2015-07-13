package cn.sh.elephant.creditcal.dao;

/**
 * Created by xiangqing on 2015/07/13.
 */
public interface IBaseDao<T> {

    /**
     * ?\
     */
    void createTable();

    /**
     * üêð??
     *
     * @param model
     * @return
     */
    boolean insert(T model);

    /**
     * ü½ð??
     *
     * @param model
     * @return
     */
    boolean batchInsert(List<T> dataList);

    /**
     * XV??
     *
     * @param model
     * @param whereClause
     * @param whereArgs
     * @return
     */
    boolean update(T model, String whereClause, String... whereArgs);

    /**
     * rè¥Ûinsert½ÒUpdate
     * @param model
     * @param bindColumnNames ?èIñ¼ ,àÒ?¥å?
     * @return
     */
    boolean insertOrUpdate(T model,String... bindColumnNames);

    /**
     * ???
     *
     * @param whereClause
     * @param whereArgs
     * @return
     */
    boolean delete(String whereClause, String... whereArgs);


    /**
     * ?S??
     * @return
     */
    boolean deleteAll();

    /**
     * ªð??
     *
     * @param whereClause
     * @param whereArgs
     * @return
     */
    List<T> queryByCondition(String selection, String... selectionArgs);

    /**
     *  ªð??
     * @param columns
     * @param selection
     * @param orderBy
     * @param selectionArgs
     * @return
     */
    List<T> queryByCondition(String[] columns, String selection,
                             String orderBy, String... selectionArgs);

    /**
     * ªð??
     * @param columns
     * @param selection
     * @param groupBy
     * @param having
     * @param orderBy
     * @param selectionArgs
     * @return
     */
    List<T> queryByCondition(String[] columns, String selection,
                             String groupBy, String having, String orderBy,
                             String... selectionArgs);

    /**
     * üLBêêð??I??
     *
     * @return @ÊvL?Ôñnull
     */
    T queryUniqueRecord(String selection,String... selectionArgs);

    /**
     * ©è???
     * @param sql
     * @param bindArgs
     * @return
     */
    List<QueryResult> execQuerySQL(String sql, String... bindArgs);


    /**
     * ?sInsert/Update/Delete´¼ñ??SQL
     * @param sql
     * @param bindArgs
     * @return
     */
    boolean execUpdateSQL(String sql, Object... bindArgs);
}
