package com.skarekrowmedia.largefamilymedicinetracker;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/*
@Datbase can create more than one database use brackets and commas
{ChildModel.class,Medicine.class}
 */
@Database(entities = {ChildModel.class}, version = 1)
public abstract class ChildDatabase extends RoomDatabase {
   private static ChildDatabase instance;
   public abstract ChildDao childDao();

   public static synchronized ChildDatabase getInstance(Context context) {
       if (instance == null) {
           instance = Room.databaseBuilder(context.getApplicationContext(), ChildDatabase.class, "childModel").fallbackToDestructiveMigration()
                   .build();
       }
       return instance;
   }
}

