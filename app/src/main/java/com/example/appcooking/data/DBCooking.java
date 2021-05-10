package com.example.appcooking.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.appcooking.Model.Category;
import com.example.appcooking.Model.Food;

import java.util.ArrayList;
import java.util.Random;

public class DBCooking {
    Context context;
    Input input;

    String dbName = "furniture.db";
    public DBCooking(Context context){
        this.context = context;
        input = new Input(context);

    }
    private SQLiteDatabase openDB(){
        return  context.openOrCreateDatabase(dbName,context.MODE_PRIVATE,null);
    }

    private void closeDB(SQLiteDatabase db)
    {
        db.close();
    }
    public void createTable() {
        SQLiteDatabase db = openDB();
        String sqlFurniture = "CREATE TABLE IF NOT EXISTS tblFood (" +
                " MaMA INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " Ten TEXT," +
                " Anh TEXT," +
                " CachLam TEXT," +
                " MaDM INTEGER );";
        String sqlCategories = "CREATE TABLE IF NOT EXISTS tbtCategory (" +
                " MaDM INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " Ten TEXT," +
                " AnhDM INTEGER );";
        db.execSQL(sqlFurniture);
        db.execSQL(sqlCategories);
        closeDB(db);
    }
    public ArrayList<Food> getALLFood() {
        SQLiteDatabase db = openDB();
        ArrayList<Food> arr = new ArrayList<>();
        String sql = "select * from tblFood";
        Cursor csr = db.rawQuery(sql, null);
        if (csr != null) {
            if (csr.moveToFirst()) {
                do {
                    int id = csr.getInt(0);
                    String name = csr.getString(1);
                    String image = csr.getString(2);
                    String description = csr.getString(3);
                    int categoryID = csr.getInt(4);

                    arr.add(new
                            Food(id,findByCatetgoriesID(categoryID),name,description,Integer.valueOf(image)));
                } while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arr;
    }
    public ArrayList<Category> getALLCategories(){
        SQLiteDatabase db = openDB();
        ArrayList<Category> arr = new ArrayList<>();
        String sql = "select * from tbtCategory";
        Cursor csr = db.rawQuery(sql, null);
        if (csr != null) {
            if (csr.moveToFirst()) {
                do {
                    int id = csr.getInt(0);
                    String name = csr.getString(1);
                    String image = csr.getString(2);
                    arr.add(new Category(id,name));
                } while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arr;
    }
    public  ArrayList<Food> getFurniture(String namefind){
        SQLiteDatabase db = openDB();
        ArrayList<Food> arr = new ArrayList<>();
        String sql= "select * from tblFood where tenMA ='"+namefind+"' ";
        Cursor csr = db.rawQuery(sql, null);
        if (csr != null) {
            if (csr.moveToFirst()) {
                do {
                    int id = csr.getInt(0);
                    String name = csr.getString(1);
                    String image = csr.getString(2);
                    String description = csr.getString(3);
                    int categoriesID = csr.getInt(4);

                    arr.add(new
                            Food(id,categoriesID,name,description,Integer.valueOf(image)));
                } while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arr;
    }
    public Category findByCatetgoriesID(int id){
        ArrayList<Category> arr = getALLCategories();
        for(Category ca : arr){
            if(ca.getMaDM() == id){
                return ca;
            }
        }
        return null;
    }
    public Category addFoodToCategories(int categoriesId){
        Category categories = findByCatetgoriesID(categoriesId);
        ArrayList<Food> arrFood = getALLFood();
        for(Food food : arrFood){
            if(food.getCategory().getMaDM() == categoriesId){
                categories.getFoodArrayList().add(food);
            }
        }
        return categories;
    }
    public void insertCategories(){
        ArrayList<Category> arrCa = input.getMockDataCategory();
        SQLiteDatabase db = openDB();
        for(Category ca : arrCa) {
            ContentValues cv = new ContentValues();
            cv.put("Ten", ca.getTenDM());
            cv.put("AnhDM", ca.getHinAnhDM());
            db.insert("tbtCategory", null, cv);
        }
        closeDB(db);
    }
    public void insertFood(){
        ArrayList<Food> arrFood = input.getMockData();
        SQLiteDatabase db = openDB();
        Random random = new Random();
        for(Food fu : arrFood) {
            ContentValues cv = new ContentValues();
            cv.put("Ten", fu.getTenMA());
            cv.put("Anh", fu.getHinhAnh());
            cv.put("CachLam", fu.getCachLam());
            cv.put("MaDM",random.nextInt(4) + 1 );
            db.insert("tblFood", null, cv);
        }
        closeDB(db);
    }
}
