package com.elyomr.examplemvvm.domain

import com.elyomr.examplemvvm.data.QuoteRepository
import com.elyomr.examplemvvm.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository : QuoteRepository){
       suspend operator fun invoke():List<QuoteModel>?= repository.getAllQuotes()

}