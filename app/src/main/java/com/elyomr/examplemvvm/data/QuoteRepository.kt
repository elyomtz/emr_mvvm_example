package com.elyomr.examplemvvm.data

import com.elyomr.examplemvvm.data.model.QuoteModel
import com.elyomr.examplemvvm.data.model.QuoteProvider
import com.elyomr.examplemvvm.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}