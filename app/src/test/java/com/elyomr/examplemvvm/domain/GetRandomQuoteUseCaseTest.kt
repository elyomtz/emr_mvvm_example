package com.elyomr.examplemvvm.domain

import com.elyomr.examplemvvm.data.QuoteRepository
import com.elyomr.examplemvvm.data.model.QuoteProvider
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class GetRandomQuoteUseCaseTest{

    @RelaxedMockK
    private lateinit var quoteRepository: QuoteRepository

    lateinit var getRandomQuoteUseCase: GetRandomQuoteUseCase

    @Before
    fun onBefore(){
        MockKAnnotations.init(this)
       // getRandomQuoteUseCase = GetRandomQuoteUseCase(quoteRepository)
    }

    @Test
    fun `when database is empty then return null`() = runBlocking{
        //Given
       // coEvery { quoteRepository.getAllQuotesFromDataBase() } returns emptyList()

        //When
        val response = getRandomQuoteUseCase()

        //Then
        assert(response==null)

    }



}