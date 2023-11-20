package com.elyomr.examplemvvm.domain

import com.elyomr.examplemvvm.data.QuoteRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.every
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class GetQuotesUseCaseTest {

    @RelaxedMockK
    private lateinit var quoteRepository: QuoteRepository

    lateinit var getQuotesUseCase: GetQuotesUseCase

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        getQuotesUseCase = GetQuotesUseCase(quoteRepository)

    }

    @Test
    fun `when the Api doesnt return anything then get values from database`() = runBlocking {
        //Given
        coEvery { quoteRepository.getAllQuotes() } returns emptyList()
        //When
        getQuotesUseCase()

        //Then
        coVerify(exactly = 1) { quoteRepository.getAllQuotes() }
    }

    @Test
    fun `when the Api doesnt return anything then get values from api`() = runBlocking {
        //Given
       // val myList = listOf(Quote("Hola Mundo","ElyoMR"))
        //coEvery { quoteRepository.getAllQuotesFromApi() } returns myList
        //When
        //val response =getQuotesUseCases()
        //Then
       // coVerify(exactly = 1) { quoteRepository.clearQuotes }
       // coVerify(exactly = 1) {quoteRepository.insertQuotes(any())}
       // coVerify(exactly = 0) {quoteRepository.getAllQuotesFromDatabase()}
        //assert(myList == response)

    }
}