package com.example.mvvmlearning_7_implementations_of_mvvm

import android.content.Context
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Quote::class],version = 1)
abstract class QuoteDatabase:RoomDatabase() {

    abstract fun quoteDao():QuoteDAO

    companion object {

        private var INSTANCE:QuoteDatabase? =null

        fun getDatabase(context:Context):QuoteDatabase{

            if (INSTANCE == null){

                synchronized(this){
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        QuoteDatabase::class.java,
                        "quote_database"
                    ).createFromAsset("quotes.db").build()

                }

            }

            return INSTANCE!!;

        }
    }


}