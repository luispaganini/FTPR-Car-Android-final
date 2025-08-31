package com.example.myapitest.data.remote

import com.example.myapitest.data.model.CarDto
import com.example.myapitest.data.model.CarValuesDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path

interface CarApiService {
    @GET("car")
    suspend fun getCars(): List<CarDto>

    @GET("car/{id}")
    suspend fun getCarById(@Path("id") carId: String): CarValuesDto

    @POST("car")
    suspend fun addCar(@Body car: CarDto): Response<Unit>

    @PATCH("car/{id}")
    suspend fun updateCar(
        @Path("id") carId: String,
        @Body carData: Map<String, @JvmSuppressWildcards Any>
    ): Response<Unit>

    @DELETE("car/{id}")
    suspend fun deleteCar(@Path("id") carId: String): Response<Unit>
}