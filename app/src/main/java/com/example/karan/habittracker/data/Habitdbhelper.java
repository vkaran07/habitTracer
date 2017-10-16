package com.example.karan.habittracker.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by karan on 4/16/2017.
 */

public class Habitdbhelper extends SQLiteOpenHelper {
    public static final String TAG = Habitdbhelper.class.getName();
    private static final String database_name = "habit.db";
    private static final int database_version = 1;

    public Habitdbhelper(Context context) {
        super(context, database_name, null, database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create_table = "Create Table " + HabitContact.Habit.table_name + "(" + HabitContact.Habit.c_ID + (" INTEGER PRIMARY KEY AUTOINCREMENT,")
                + HabitContact.Habit.Habit_name + (" TEXT NOT NULL,") + HabitContact.Habit.mon + (" TEXT NOT NULL,") +
                HabitContact.Habit.tues + (" TEXT NOT NULL  ,") + HabitContact.Habit.wed + (" TEXT NOT NULL ,") +
                HabitContact.Habit.thurs + (" TEXT NOT NULL ,") + HabitContact.Habit.fri + (" TEXT NOT NULL ,") +
                HabitContact.Habit.sat + (" TEXT NOT NULL,") + HabitContact.Habit.sun + (" TEXT NOT NULL ") + ");";
        db.execSQL(create_table);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void create() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(HabitContact.Habit.Habit_name, "PLAYING FOOTBALL");
        cv.put(HabitContact.Habit.mon, 0);
        cv.put(HabitContact.Habit.tues, 1);
        cv.put(HabitContact.Habit.wed, 0);
        cv.put(HabitContact.Habit.thurs, 1);
        cv.put(HabitContact.Habit.fri, 0);
        cv.put(HabitContact.Habit.sat, 1);
        cv.put(HabitContact.Habit.sun, 1);
        db.insert(HabitContact.Habit.table_name, null, cv);
    }

    private Cursor read() {
        SQLiteDatabase SQdb = this.getReadableDatabase();
        String[] proj = {
                HabitContact.Habit.Habit_name,
                HabitContact.Habit.mon,
                HabitContact.Habit.thurs
        };
        Cursor cu = SQdb.query(
                HabitContact.Habit.table_name,
                proj,
                null,
                null,
                null,
                null,
                null
        );
        return cu;
    }
}
