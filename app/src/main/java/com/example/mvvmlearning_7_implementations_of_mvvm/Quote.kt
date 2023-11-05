package com.example.mvvmlearning_7_implementations_of_mvvm

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quotes")
data class Quote(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val text:String,
    val author:String
)
