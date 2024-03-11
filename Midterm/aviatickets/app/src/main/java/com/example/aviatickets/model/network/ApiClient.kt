package com.example.aviatickets.model.network


import com.example.aviatickets.model.entity.Offer
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


import retrofit2.Call
import retrofit2.http.GET

object ApiClient {

  private val retrofit = Retrofit.Builder()
    .baseUrl("https://my-json-server.typicode.com/estharossa/fake-api-demo/offer_list/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

  interface OfferService {
    @GET("offer_list")
    fun fetchOfferList(): Call<List<Offer>>
  }

  val apiService: OfferService = retrofit.create(OfferService::class.java)
}


