package cn.sh.elephant.creditcal.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import cn.sh.elephant.creditcal.bean.CreditRate;

import java.util.List;

/**
 * Created by HomeStudio on 2015/7/19.
 */
public class CreditRateDao implements IBaseDao<CreditRate> {
    private SQLiteDatabase mDatabase;

    public CreditRateDao(SQLiteDatabase db) {
        super();
        mDatabase = db;
    }

    /**
     * 创建表
     */
    @Override
    public void createTable() {
        mDatabase.execSQL(CreditDBOpenHelper.TABLE_CREDIT_RATE);
    }

    /**
     * 插入一条记录
     *
     * @param model
     * @return
     */
    @Override
    public boolean insert(CreditRate model) {
        return false;
    }

    /**
     * 插入多条记录
     *
     * @param dataList@return
     */
    @Override
    public boolean batchInsert(List<CreditRate> dataList) {
        return false;
    }

    /**
     * 更新记录
     *
     * @param model
     * @param whereClause
     * @param whereArgs
     * @return
     */
    @Override
    public boolean update(CreditRate model, String whereClause, String... whereArgs) {
        return false;
    }

    /**
     * 决定是否insert或者Update
     *
     * @param model
     * @param bindColumnNames 绑定的列名 ,默认是主键
     * @return
     */
    @Override
    public boolean insertOrUpdate(CreditRate model, String... bindColumnNames) {
        return false;
    }

    /**
     * 删除记录
     *
     * @param whereClause
     * @param whereArgs
     * @return
     */
    @Override
    public boolean delete(String whereClause, String... whereArgs) {
        return false;
    }

    /**
     * 删除全部记录
     *
     * @return
     */
    @Override
    public boolean deleteAll() {
        return false;
    }

    /**
     * 根据条件查询
     *
     * @param selection
     * @param selectionArgs
     * @return
     */
    @Override
    public List<CreditRate> queryByCondition(String selection, String... selectionArgs) {
        return null;
    }

    /**
     * 根据条件查询
     *
     * @param columns
     * @param selection
     * @param orderBy
     * @param selectionArgs
     * @return
     */
    @Override
    public List<CreditRate> queryByCondition(String[] columns, String selection, String orderBy, String... selectionArgs) {
        return null;
    }

    /**
     * 根据条件查询
     *
     * @param columns
     * @param selection
     * @param groupBy
     * @param having
     * @param orderBy
     * @param selectionArgs
     * @return
     */
    @Override
    public List<CreditRate> queryByCondition(String[] columns, String selection, String groupBy, String having, String orderBy, String... selectionArgs) {
        return null;
    }

    /**
     * 只有唯一一条记录的查询
     *
     * @param selection
     * @param selectionArgs
     * @return 如果没有则返回null
     */
    @Override
    public CreditRate queryUniqueRecord(String selection, String... selectionArgs) {
        return null;
    }

    /**
     * 自定义查询
     *
     * @param sql
     * @param bindArgs
     * @return
     */
    @Override
    public List<CreditRate> execQuerySQL(String sql, String... bindArgs) {
        return null;
    }

    /**
     * 执行Insert/Update/Delete等其他非查询SQL
     *
     * @param sql
     * @param bindArgs
     * @return
     */
    @Override
    public boolean execUpdateSQL(String sql, Object... bindArgs) {
        return false;
    }
}
