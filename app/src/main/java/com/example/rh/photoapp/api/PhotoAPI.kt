package com.example.rh.photoapp.api

import com.example.rh.photoapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoAPI {
    @GET("?key=10875878-31d3353280ab5273e26cc7b27&q=nature&image_type=photo")
    fun getPhotos(): Call<PhotoList>
}