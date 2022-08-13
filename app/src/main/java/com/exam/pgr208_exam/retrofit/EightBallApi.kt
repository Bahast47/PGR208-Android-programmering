package com.exam.pgr208_exam.retrofit

import android.telecom.Call
import retrofit2.Call
import retrofit2.http.GET

interface EightBallApi {
    @GET("magic")
    fun getSummary(): Call<SummaryResponse>
}