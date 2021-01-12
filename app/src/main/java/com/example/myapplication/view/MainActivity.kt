package com.example.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.model.dataclass.Superhero
import com.example.myapplication.model.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    val TAG = "pame"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*  val mRetrofit= RetrofitClient.retrofitInstance()
        mRetrofit.getAllSuperheroesFromApi().enqueue(object :
            Callback<List<Superhero>> {
            override fun onResponse(
                call: Call<List<Superhero>>,
                response: Response<List<Superhero>>
            ) {
                Log.d("pame", "si recibe de internet")
                Log.d(TAG, "onResponse: ${response.body()}")
            }

            override fun onFailure(call: Call<List<Superhero>>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Fallo la llamada", Toast.LENGTH_LONG).show()
            }
        })
       */
        supportFragmentManager.beginTransaction().replace(R.id.hero_fragment,SuperheroFragment.newInstance()).commit()
        //iniciar el fragmento ponerlo dentro del framlayout herofragment
    }}
