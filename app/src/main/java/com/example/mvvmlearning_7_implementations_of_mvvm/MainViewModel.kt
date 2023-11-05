package com.example.mvvmlearning_7_implementations_of_mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private var quoteRepository: QuoteRepository ):ViewModel() {

   fun getQuotes(): LiveData<List<Quote>> {
       return quoteRepository.getQuotes()

    }

    fun insertQuote(quote:Quote){
//        NOTE:
//        As it is suspend function so we need to call it from coroutine
        viewModelScope.launch(Dispatchers.IO) {
            quoteRepository.insertQuotes(quote)
        }
    }

}