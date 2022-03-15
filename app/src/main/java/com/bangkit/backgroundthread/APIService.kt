package com.bangkit.backgroundthread

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface APIService {
    @GET("detail/{id}")
    fun getRestaurant (
        @Path("id") id: String
    ): Call<RestaurantResponse>
}