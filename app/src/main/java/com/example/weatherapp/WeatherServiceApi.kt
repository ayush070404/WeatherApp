package com.example.weatherapp

import com.example.weatherapp.models.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherServiceApi {

    @GET("2.5/weather")
    fun getWeatherDetails(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("appid") appId: String,
        @Query("units") metric: String
    ): Call<WeatherResponse>

    // 🔍 Weather by city name (for search bar)
    @GET("2.5/weather")
    fun getWeatherByCity(
        @Query("q") cityName: String,
        @Query("appid") appId: String,
        @Query("units") metric: String
    ): Call<WeatherResponse>
}
