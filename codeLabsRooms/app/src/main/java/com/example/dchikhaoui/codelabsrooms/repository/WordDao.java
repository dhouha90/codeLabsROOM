package com.example.dchikhaoui.codelabsrooms.repository;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.dchikhaoui.codelabsrooms.Model.Word;

import java.util.List;

@Dao
public interface WordDao {
    @Insert
    void insert(Word word);
    //There are also @Delete and @Update annotations for deleting and updating a row
    /*There is no convenience annotation for deleting multiple entities,
    so annotate the method with the generic @Query

    Room generates all necessary code to update the LiveData when database is updated

    If you use LiveData independently from Room, you have to manage updating the data.
    LiveData has no publicly available methods to update the stored data.

    If you, the developer, want to update the stored data, you must use MutableLiveData
    instead of LiveData. The MutableLiveData class has two public methods that allow you to
    set the value of a LiveData object, setValue(T) and postValue(T). Usually, MutableLiveData
    is used in the ViewModel, and then the ViewModel only exposes immutable LiveData objects
    to the observers.*/


    @Query("DELETE FROM word_table")
    void deleteAll();

    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();

}
