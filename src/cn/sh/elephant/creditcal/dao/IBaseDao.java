package cn.sh.elephant.creditcal.dao;

/**
 * Created by xiangqing on 2015/07/13.
 */
public interface IBaseDao<T> {

    /**
     * ?建表
     */
    void createTable();

    /**
     * 插入一条??
     *
     * @param model
     * @return
     */
    boolean insert(T model);

    /**
     * 插入多条??
     *
     * @param model
     * @return
     */
    boolean batchInsert(List<T> dataList);

    /**
     * 更新??
     *
     * @param model
     * @param whereClause
     * @param whereArgs
     * @return
     */
    boolean update(T model, String whereClause, String... whereArgs);

    /**
     * 决定是否insert或者Update
     * @param model
     * @param bindColumnNames ?定的列名 ,默?是主?
     * @return
     */
    boolean insertOrUpdate(T model,String... bindColumnNames);

    /**
     * ?除??
     *
     * @param whereClause
     * @param whereArgs
     * @return
     */
    boolean delete(String whereClause, String... whereArgs);


    /**
     * ?除全部??
     * @return
     */
    boolean deleteAll();

    /**
     * 根据条件??
     *
     * @param whereClause
     * @param whereArgs
     * @return
     */
    List<T> queryByCondition(String selection, String... selectionArgs);

    /**
     *  根据条件??
     * @param columns
     * @param selection
     * @param orderBy
     * @param selectionArgs
     * @return
     */
    List<T> queryByCondition(String[] columns, String selection,
                             String orderBy, String... selectionArgs);

    /**
     * 根据条件??
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
     * 只有唯一一条??的??
     *
     * @return 如果没有?返回null
     */
    T queryUniqueRecord(String selection,String... selectionArgs);

    /**
     * 自定???
     * @param sql
     * @param bindArgs
     * @return
     */
    List<QueryResult> execQuerySQL(String sql, String... bindArgs);


    /**
     * ?行Insert/Update/Delete等其他非??SQL
     * @param sql
     * @param bindArgs
     * @return
     */
    boolean execUpdateSQL(String sql, Object... bindArgs);
}
