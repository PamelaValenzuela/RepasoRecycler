package com.example.myapplication.model.repository

import com.example.myapplication.model.dataclass.Superhero
import com.example.myapplication.model.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryHero {
    private val mRetrofit= RetrofitClient.retrofitInstance()
    fun getSuperHero(){
        mRetrofit.getAllSuperheroesFromApi().enqueue(object : Callback<List<Superhero>> {
            override fun onResponse(call: Call<List<Superhero>>, response: Response<List<Superhero>>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<List<Superhero>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}