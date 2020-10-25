package com.mofucius.easypodcast.auth

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import retrofit2.http.Query

interface AccountService  {

    @FormUrlEncoded
    @POST("/api/v1/account/login")
    suspend fun login(@Field("userName") email: String,
                      @Field("password") password: String,
                      @Field("deviceName") deviceName: String,
                      @Field("deviceId") deviceId: String,
                      @Field("host") host: String) : LoginResponse


}