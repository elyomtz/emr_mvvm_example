package com.elyomr.examplemvvm.domain

import com.elyomr.examplemvvm.data.QuoteRepository
import com.elyomr.examplemvvm.data.model.QuoteModel
import com.elyomr.examplemvvm.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(private val quoteProvider: QuoteProvider) {
// private val repository = QuoteRepository()
    operator fun invoke():QuoteModel?{
        val quotes = quoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (0..quotes.size-1).random()
            return quotes[randomNumber]
        }
       return null
    }
}