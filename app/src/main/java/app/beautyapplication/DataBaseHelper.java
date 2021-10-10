package app.beautyapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String PRODUCT_TABLE = "PRODUCT_TABLE";
    public static final String COLUMN_PRODUCT_TYPE = "PRODUCT_TYPE";
    public static final String COLUMN_PRODUCT_NAME = "PRODUCT_NAME";
    public static final String COLUMN_PRODUCT_BRAND = "PRODUCT_BRAND";
    public static final String COLUMN_ID = "ID";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "products.db", null, 1);
    }

    // This is called the first time the database is accessed
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + PRODUCT_TABLE + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_PRODUCT_TYPE + " TEXT, " + COLUMN_PRODUCT_NAME + " TEXT, " + COLUMN_PRODUCT_BRAND + " TEXT)";
        db.execSQL(createTableStatement);
    }

    // This allows upgrades
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public boolean AddOne(String name, String brand, String product_type) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_PRODUCT_NAME, name);
        cv.put(COLUMN_PRODUCT_BRAND, brand);
        cv.put(COLUMN_PRODUCT_TYPE, product_type);

        long insert = db.insert(PRODUCT_TABLE, null, cv);

        if (insert == -1) {
            return false;
        } else {
            return true;
        }
    }
}
