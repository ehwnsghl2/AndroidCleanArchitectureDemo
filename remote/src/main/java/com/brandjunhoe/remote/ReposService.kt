package com.brandjunhoe.remote

import com.brandjunhoe.remote.model.ReposModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path


interface ReposService {

    @GET("/users/{username}/repos")
    fun repos(@Path("username") username: String): Single<List<ReposModel>>



}