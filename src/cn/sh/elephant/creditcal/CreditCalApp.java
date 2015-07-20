package cn.sh.elephant.creditcal;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import cn.sh.elephant.creditcal.dao.CreditDBOpenHelper;

/**
 * Created by HomeStudio on 2015/7/15.
 */
public class CreditCalApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("Application", "onCreate");
        CreditDBOpenHelper credit = new CreditDBOpenHelper(this, CreditDBOpenHelper.DATABASE_NAME, null, CreditDBOpenHelper.DATABASE_VERSION);
        SQLiteDatabase db = credit.getReadableDatabase();
        Log.i("Application","on Create DB");
        db.getVersion();
    }

    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     * If you override this method, be sure to call super.onCreate().
     */
    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     * If you override this method, be sure to call super.onCreate().
     */

}
