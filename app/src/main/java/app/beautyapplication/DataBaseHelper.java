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

    public boolean AddOne(ProductModel productModel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();


        cv.put(COLUMN_PRODUCT_NAME, productModel.GetName());
        cv.put(COLUMN_PRODUCT_BRAND, productModel.GetBrand());
        cv.put(COLUMN_PRODUCT_TYPE, productModel.GetProductType());

        long insert = db.insert(PRODUCT_TABLE, null, cv);

//        if (insert == -1) {
//            return false;
//        } else {
//            return true;
//        }
        return insert != -1;
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
        String queryString = "SELECT * FROM " + PRODUCT_TABLE + " WHERE " + COLUMN_PRODUCT_TYPE + " LIKE " + '\'' + product_type + '\'' + " ORDER BY " + COLUMN_PRODUCT_NAME + " ASC";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if (cursor.moveToNext()) {
            do {
                // TODO cursor.getString(0) returns the index of the product.
                // TODO cursor.getString(1) returns the product type *Primer, Foundation, etc*.
                // TODO cursor.getString(2) returns the Name entered for the product.
                // TODO cursor.getString(3) returns the Brand entered for the product.

                String productType = cursor.getString(1);
                String productName = cursor.getString(2);
                String productBrand = cursor.getString(3);

                ProductModel newProduct = new ProductModel(productName, productBrand, productType);

                products.add(newProduct);
            }
            while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return products;
    }

    public List<ProductModel> GetProductFromDatabase(String product_Name) {
        List<ProductModel> products = new ArrayList<>();
//        String queryString = "SELECT " + COLUMN_PRODUCT_NAME + " FROM " + PRODUCT_TABLE + " WHERE " + COLUMN_PRODUCT_NAME + " = " + '\'' + product_Name + '\'';
        String queryString = "SELECT * FROM " + PRODUCT_TABLE + " WHERE " + COLUMN_PRODUCT_NAME + " LIKE " + '\'' + product_Name + '\'';
//        String queryString = "SELECT " + COLUMN_PRODUCT_NAME + " FROM " + PRODUCT_TABLE + " WHERE " + COLUMN_PRODUCT_NAME + " LIKE " + '\'' + product_Name + '\'';
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);

        if (cursor.moveToNext()) {
            do {
                String productType = cursor.getString(1);
                String productName = cursor.getString(2);
                String productBrand = cursor.getString(3);

                ProductModel newProduct = new ProductModel(productName, productBrand, productType);

                products.add(newProduct);
            }
            while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return products;
    }

        public boolean EditProduct(String product_Name, String new_product_name) {
        SQLiteDatabase db = this.getWritableDatabase();

//        String queryString = "WHERE " + '\'' + product_Name + '\'';

        //TODO NEEDS TO ALSO INCLUDE THE BRAND NAME. DO THIS AFTER TESTING TO MAKE SURE THE QUERY WORKS

        Cursor cursor = db.rawQuery("SELECT * FROM PRODUCT_TABLE WHERE product_Name = ?", new String[]{product_Name});
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_PRODUCT_NAME, new_product_name);
            long result = db.update(PRODUCT_TABLE, cv,"product_Name=?",new String[]{product_Name});
//        long update = db.update(PRODUCT_TABLE, cv,"COLUMN_PRODUCT_NAME=?",new String[]{});
//        cursor.close();
//        db.close();
            return result != -1;
    }


    public void DeleteProduct() {

    }


    // TODO MAY NOT WORK PROPERLY YET
    public int GetProductIndex(String product_Name) {
        SQLiteDatabase db = this.getReadableDatabase();
        String queryString = "SELECT * FROM " + PRODUCT_TABLE + " WHERE " + COLUMN_PRODUCT_NAME + " LIKE " + '\'' + product_Name + '\'';
        Cursor cursor = db.rawQuery(queryString, null);
        int index = Integer.parseInt(cursor.getString(0));
        cursor.close();
        db.close();
        return index;
    }

//    void CreateProducts(Cursor cursor){
//
//    }
}

