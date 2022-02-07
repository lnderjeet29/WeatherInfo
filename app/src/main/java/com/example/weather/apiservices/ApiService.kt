package com.example.weather.apiservices

import com.example.weather.model.AllWeatherData
import com.example.weather.model.WeatherData
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("/data/2.5/weather")
    suspend fun getWeatherDetail(
        @Query("lat")lat:Float,
        @Query("lon")lon:Float,
        @Query("appid")apiKey:String
    ):WeatherData

    @GET("/data/2.5/onecall")
    suspend fun getAllDayWeatherDetail(
        @Query("lat")lat:Float,
        @Query("lon")lon:Float,
        @Query("exclude")exclude:String,
        @Query("appid")apiKey:String
    ):AllWeatherData
}