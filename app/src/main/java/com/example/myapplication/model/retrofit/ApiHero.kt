package com.example.myapplication.model.retrofit
import com.example.myapplication.model.dataclass.Superhero
import retrofit2.Call
import retrofit2.http.GET

interface ApiHero {

    @GET("all.json")
    fun getAllSuperheroesFromApi():Call<List<Superhero>>



}