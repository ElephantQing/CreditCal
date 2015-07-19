package cn.sh.elephant.creditcal.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by HomeStudio on 2015/7/13.
 */
public class CreditDBOpenHelper extends SQLiteOpenHelper {
    public static final String KEY_CREDIT_RATE_INDEX = "creditRateNo";
    public static final String KEY_YEAR = "year";
    public static final String KEY_PERIOD = "period";
    public static final String KEY_C_RATE = "cRate";
    public static final String KEY_B_RATE = "bRate";
    public static final String DATABASE_NAME = "creditCal.db";
    public static final String TABLE_CREDIT_RATE = "CreditRate";
    public static final int DATABASE_VERSION = 1;
    private static final String CREATE_TABLE_CREDIT_RATE_ = "create table " + TABLE_CREDIT_RATE + "(" + KEY_CREDIT_RATE_INDEX + " Integer primary key autoincrement default 1," + KEY_YEAR + " char(4), " + KEY_PERIOD + " Integer, " + KEY_C_RATE + " decimal(5,4), " + KEY_B_RATE + " decimal(5,4));";

    /**
     * Create a helper object to create, open, and/or manage a database.
     * This method always returns very quickly.  The database is not actually
     * created or opened until one of {@link #getWritableDatabase} or
     * {@link #getReadableDatabase} is called.
     *
     * @param context to use to open or create the database
     * @param name    of the database file, or null for an in-memory database
     * @param factory to use for creating cursor objects, or null for the default
     * @param version number of the database (starting at 1); if the database is older,
     *                {@link #onUpgrade} will be used to upgrade the database; if the database is
     *                newer, {@link #onDowngrade} will be used to downgrade the database
     */
    public CreditDBOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    /**
     * Called when the database is created for the first time. This is where the
     * creation of tables and the initial population of the tables should happen.
     *
     * @param db The database.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_CREDIT_RATE_);
    }

    /**
     * Called when the database needs to be upgraded. The implementation
     * should use this method to drop tables, add tables, or do anything else it
     * needs to upgrade to the new schema version.
     * <p/>
     * <p>
     * The SQLite ALTER TABLE documentation can be found
     * <a href="http://sqlite.org/lang_altertable.html">here</a>. If you add new columns
     * you can use ALTER TABLE to insert them into a live table. If you rename or remove columns
     * you can use ALTER TABLE to rename the old table, then create the new table and then
     * populate the new table with the contents of the old table.
     * </p><p>
     * This method executes within a transaction.  If an exception is thrown, all changes
     * will automatically be rolled back.
     * </p>
     *
     * @param db         The database.
     * @param oldVersion The old database version.
     * @param newVersion The new database version.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i("CreditDBOpenHelper", "onUpgrade()");
        db.execSQL("drop table if exists " + TABLE_CREDIT_RATE);
        onCreate(db);
    }

}
