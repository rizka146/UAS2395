package com.rizka.githubapi.api

import com.rizka.githubapi.data.model.DetailUserResponse
import com.rizka.githubapi.data.model.User
import com.rizka.githubapi.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 7767f28c6536fc495aa38f9ef5cd8d64daa2dbed")
    fun getSearchUsers(
        @Query("q")query : String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 7767f28c6536fc495aa38f9ef5cd8d64daa2dbed")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 7767f28c6536fc495aa38f9ef5cd8d64daa2dbed")
    fun getFollowers(
        @Path("username") username : String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 7767f28c6536fc495aa38f9ef5cd8d64daa2dbed")
    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>
}