package com.elyomr.examplemvvm.data

import com.elyomr.examplemvvm.data.model.QuoteModel
import com.elyomr.examplemvvm.data.model.QuoteProvider
import com.elyomr.examplemvvm.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(private val api:QuoteService, private val quoteProvider: QuoteProvider) {
    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}