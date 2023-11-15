package com.elyomr.examplemvvm.domain

import com.elyomr.examplemvvm.data.QuoteRepository
import com.elyomr.examplemvvm.data.model.QuoteModel
import com.elyomr.examplemvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {
    private val repository = QuoteRepository()
    operator fun invoke():QuoteModel?{
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (0..quotes.size-1).random()
            return quotes[randomNumber]
        }
       return null
    }
}