package app.beautyapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String PRODUCT_TABLE = "PRODUCT_TABLE";
    public static final String COLUMN_PRODUCT_TYPE = "PRODUCT_TYPE";
    public static final String COLUMN_PRODUCT_NAME = "PRODUCT_NAME";
    public static final String COLUMN_PRODUCT_BRAND = "PRODUCT_BRAND";
    public static final String COLUMN_PRODUCT_EXP_DATE = "COLUMN_PRODUCT_EXP_DATE";
    public static final String COLUMN_ID = "ID";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "products.db", null, 1);
    }
 // TODO INCREASE THE VERSION NUMBER
    // This is called the first time the database is accessed
    @Override
    public void onCreate(SQLiteDatabase db) {
//        String createTableStatement = "CREATE TABLE " + PRODUCT_TABLE + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_PRODUCT_TYPE + " TEXT, " + COLUMN_PRODUCT_NAME + " TEXT, " + COLUMN_PRODUCT_BRAND + " TEXT)";
        String createTableStatement = "CREATE TABLE " +
                PRODUCT_TABLE + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_PRODUCT_TYPE + " TEXT, " +
                COLUMN_PRODUCT_NAME + " TEXT, " +
                COLUMN_PRODUCT_BRAND + " TEXT, " +
                COLUMN_PRODUCT_EXP_DATE + " TEXT " +
                ")";
        db.execSQL(createTableStatement);
    }

    // This allows upgrades
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
// TODO - IF OLD VERSION IS = 1 THEN USE THE "ALTER" STATEMENT TO ADD TO THE DATABASE
  }

    public boolean AddOne(ProductModel productModel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_PRODUCT_NAME, productModel.GetName());
        cv.put(COLUMN_PRODUCT_BRAND, productModel.GetBrand());
        cv.put(COLUMN_PRODUCT_TYPE, productModel.GetProductType());
        cv.put(COLUMN_PRODUCT_EXP_DATE, productModel.GetExpDate());

        long insert = db.insert(PRODUCT_TABLE, null, cv);

        return insert != -1;
    }


    public boolean DeleteOne(int index) {
        SQLiteDatabase db = getWritableDatabase();
        String queryString = "DELETE FROM " + PRODUCT_TABLE + " WHERE " + COLUMN_ID + " = " + '\'' + index + '\'';
        db.execSQL(queryString);
        db.close();
        return true;
    }


    public List<String> GetAllBrands() {
        List brands = new ArrayList<>();
        String queryString = "SELECT DISTINCT " + COLUMN_PRODUCT_BRAND + " FROM " + PRODUCT_TABLE + " ORDER BY " + COLUMN_PRODUCT_BRAND + " ASC";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if (cursor.moveToNext()) {
            do {
                brands.add(cursor.getString(0));
//                brandBtn.setText(cursor.toString());
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return brands;
    }

    public List<ProductModel> GetAllProductsFromType(String product_type) {
        List<ProductModel> products = new ArrayList<>();
        String queryString = "SELECT * FROM " + PRODUCT_TABLE + " WHERE " + COLUMN_PRODUCT_TYPE + " LIKE " + '\'' + product_type + '\'';
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if (cursor.moveToNext()) {
            do {
//                // TODO cursor.getString(0) returns the index of the product.
//                // TODO cursor.getString(1) returns the product type *Primer, Foundation, etc*.
//                // TODO cursor.getString(2) returns the Name entered for the product.
//                // TODO cursor.getString(3) returns the Brand entered for the product.
                int productID = cursor.getInt(0);
                String productType = cursor.getString(1);
                String productName = cursor.getString(2);
                String productBrand = cursor.getString(3);
                String productExpDate = cursor.getString(4);

                ProductModel newProduct = new ProductModel(productID, productName, productBrand, productType, productExpDate);


                products.add(newProduct);
            }
            while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return products;
    }


    public List<ProductModel> GetAllProductsFromTypeAlphabetical(String product_type) {
        List<ProductModel> products = new ArrayList<>();
        String queryString = "SELECT * FROM " + PRODUCT_TABLE + " WHERE " + COLUMN_PRODUCT_TYPE + " LIKE " + '\'' + product_type + '\'' + " ORDER BY " + COLUMN_PRODUCT_NAME + " ASC";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if (cursor.moveToNext()) {
            do {
                // TODO cursor.getString(0) returns the index of the product.
                // TODO cursor.getString(1) returns the product type *Primer, Foundation, etc*.
                // TODO cursor.getString(2) returns the Name entered for the product.
                // TODO cursor.getString(3) returns the Brand entered for the product.

                int productID = cursor.getInt(0);
                String productType = cursor.getString(1);
                String productName = cursor.getString(2);
                String productBrand = cursor.getString(3);
                String productExpDate = cursor.getString(4);

                ProductModel newProduct = new ProductModel(productID, productName, productBrand, productType,productExpDate);

                products.add(newProduct);
            }
            while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return products;
    }

    public List<ProductModel> GetAllProductsFromTypeExpDate(String product_type) {
        List<ProductModel> products = new ArrayList<>();
        String queryString = "SELECT * FROM " + PRODUCT_TABLE + " WHERE " + COLUMN_PRODUCT_TYPE + " LIKE " + '\'' + product_type + '\'' + " ORDER BY " + COLUMN_PRODUCT_EXP_DATE + " ASC";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if (cursor.moveToNext()) {
            do {
                // TODO cursor.getString(0) returns the index of the product.
                // TODO cursor.getString(1) returns the product type *Primer, Foundation, etc*.
                // TODO cursor.getString(2) returns the Name entered for the product.
                // TODO cursor.getString(3) returns the Brand entered for the product.

                int productID = cursor.getInt(0);
                String productType = cursor.getString(1);
                String productName = cursor.getString(2);
                String productBrand = cursor.getString(3);
                String productExpDate = cursor.getString(4);

                ProductModel newProduct = new ProductModel(productID, productName, productBrand, productType,productExpDate);

                products.add(newProduct);
            }
            while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return products;
    }

    public void EditProduct(ProductModel productModel) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(COLUMN_PRODUCT_NAME, productModel.GetName());
        cv.put(COLUMN_PRODUCT_BRAND, productModel.GetBrand());
        cv.put(COLUMN_PRODUCT_TYPE, productModel.GetProductType());
        cv.put(COLUMN_ID, productModel.GetID());
        cv.put(COLUMN_PRODUCT_EXP_DATE, productModel.GetExpDate());


        int update = db.update(PRODUCT_TABLE, cv, "ID = '" + productModel.GetID() + "'", null);

        db.close();

    }

}

