package com.example.mvvmlearning_7_implementations_of_mvvm

import androidx.lifecycle.LiveData

// Repository is a class that abstracts access to multiple data sources

//TODO: 1. Create a Repository class

//STEPS: Create Repository class and implement all the methods od DAO interface
//

class QuoteRepository(var quoteDAO: QuoteDAO) {

    fun getQuotes():LiveData<List<Quote>> {
        return quoteDAO.getQuotes()
    }

    suspend fun insertQuotes(quote:Quote){
       quoteDAO.insertQuotes(quote)
   }

}