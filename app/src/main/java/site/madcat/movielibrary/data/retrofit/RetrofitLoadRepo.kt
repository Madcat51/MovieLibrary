package site.madcat.movielibrary.data.retrofit

import retrofit2.Call
import retrofit2.http.GET
import site.madcat.movielibrary.domain.ReturnPackage


interface RetrofitLoadRepo {

    @GET("discover/movie?&sort_by=popularity.desc&api_key=b46aa2f69329d4b3b5e8d2e1ea6b7886")
   fun loadMovie(): Call<ReturnPackage>


}