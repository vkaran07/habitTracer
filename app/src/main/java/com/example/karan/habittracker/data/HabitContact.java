package com.example.karan.habittracker.data;

import android.provider.BaseColumns;

/**
 * Created by karan on 4/16/2017.
 */

public class HabitContact {
    private HabitContact() {
    }

    public static final class Habit implements BaseColumns {
        public static final String table_name = "Habit";
        public static final String c_ID = BaseColumns._ID;
        public static final String Habit_name = "HabitName";
        public static final String mon = "MONDAY";
        public static final String tues = "TUESDAY";
        public static final String wed = "WEDNESDAY";
        public static final String thurs = "THURSDAY";
        public static final String fri = "FRIDAY";
        public static final String sat = "SATURDAY";
        public static final String sun = "SUNDAY";
        public static final int yes = 1;
        public static final int no = 0;


    }

}
