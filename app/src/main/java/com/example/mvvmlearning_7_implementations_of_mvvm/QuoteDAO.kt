package com.example.mvvmlearning_7_implementations_of_mvvm

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuoteDAO {

    @Query("SELECT * FROM quotes")
    fun getQuotes():LiveData<List<Quote>>


    @Insert
   suspend fun insertQuotes(quote:Quote)

}