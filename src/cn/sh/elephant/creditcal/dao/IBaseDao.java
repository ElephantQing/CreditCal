package cn.sh.elephant.creditcal.dao;

/**
 * Created by xiangqing on 2015/07/13.
 */
public interface IBaseDao<T> {

    /**
     * ?���\
     */
    void createTable();

    /**
     * �������??
     *
     * @param model
     * @return
     */
    boolean insert(T model);

    /**
     * ��������??
     *
     * @param model
     * @return
     */
    boolean batchInsert(List<T> dataList);

    /**
     * �X�V??
     *
     * @param model
     * @param whereClause
     * @param whereArgs
     * @return
     */
    boolean update(T model, String whereClause, String... whereArgs);

    /**
     * �r�营��insert����Update
     * @param model
     * @param bindColumnNames ?��I�� ,��?����?
     * @return
     */
    boolean insertOrUpdate(T model,String... bindColumnNames);

    /**
     * ?��??
     *
     * @param whereClause
     * @param whereArgs
     * @return
     */
    boolean delete(String whereClause, String... whereArgs);


    /**
     * ?���S��??
     * @return
     */
    boolean deleteAll();

    /**
     * ��������??
     *
     * @param whereClause
     * @param whereArgs
     * @return
     */
    List<T> queryByCondition(String selection, String... selectionArgs);

    /**
     *  ��������??
     * @param columns
     * @param selection
     * @param orderBy
     * @param selectionArgs
     * @return
     */
    List<T> queryByCondition(String[] columns, String selection,
                             String orderBy, String... selectionArgs);

    /**
     * ��������??
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
     * ���L�B����??�I??
     *
     * @return �@�ʖv�L?�ԉ�null
     */
    T queryUniqueRecord(String selection,String... selectionArgs);

    /**
     * ����???
     * @param sql
     * @param bindArgs
     * @return
     */
    List<QueryResult> execQuerySQL(String sql, String... bindArgs);


    /**
     * ?�sInsert/Update/Delete��������??SQL
     * @param sql
     * @param bindArgs
     * @return
     */
    boolean execUpdateSQL(String sql, Object... bindArgs);
}
