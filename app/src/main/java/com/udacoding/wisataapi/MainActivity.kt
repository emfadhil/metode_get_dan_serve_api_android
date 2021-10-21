package com.udacoding.wisataapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.udacoding.wisataapi.model.Wisata
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val retrofit = Retrofit.Builder()
            .baseUrl("http://www.udacoding.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(WisataService::class.java)


        //request
        service.getWisata().enqueue(object  : Callback<Wisata>{
            override fun onResponse(call: Call<Wisata>, response: Response<Wisata>) {
                Log.d("RESPONSE SERVER", "onResponse: ${response.message()}")

                val code = response.body()?.status_code

                if(code == 200){

                    //get data
                    val data = response.body()?.data


                }







            }

            override fun onFailure(call: Call<Wisata>, t: Throwable) {
                Log.d("RESPONSE ERROR",t.localizedMessage)
            }
        })



    }
}