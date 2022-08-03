package com.skarekrowmedia.largefamilymedicinetracker;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ChildDao {

    @Insert
    void insert(ChildModel childModel);

    @Update
    void update(ChildModel childModel);

    @Delete
    void delete(ChildModel childModel);

    @Query("DELETE FROM childInfo")
    void deleteAllChildren();

    @Query("SELECT * FROM childInfo ORDER BY childName Asc")
    LiveData<List<ChildModel>> getAllChildren();
    /*
    This gets all the children and the LiveData tells Android if
    there are any changes we want the latest data in this object.
     */
}
