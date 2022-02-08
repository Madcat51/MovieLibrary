package site.madcat.movielibrary.data

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import site.madcat.movielibrary.data.retrofit.RetrofitLoadRepo
import site.madcat.movielibrary.domain.GetMovieInterface
import site.madcat.movielibrary.domain.LocalMovieRepository
import site.madcat.movielibrary.domain.ReturnPackage

private const val BASE_URL = "https://api.themoviedb.org/"
class GetRetrofitMovieImpl:GetMovieInterface {


    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private var retrofitAPI: RetrofitLoadRepo = retrofit.create(RetrofitLoadRepo::class.java)
    override fun getMovieSync(path: String, repo: LocalMovieRepository): String {
        TODO("Not yet implemented")
    }


    override fun getMovieAsync(
        repo: LocalMovieRepository,
        onSuccess: (List<ReturnPackage>) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        retrofitAPI.loadMovie().enqueue(object:Callback<List<ReturnPackage>> {


            override fun onFailure(call: Call<List<ReturnPackage>>, t: Throwable) {
                onError(t)
            }

            override fun onResponse(
                call: Call<List<ReturnPackage>>,
                response: Response<List<ReturnPackage>>
            ){
                if (response.isSuccessful) {
                    onSuccess(response.body() ?: throw IllegalStateException("null result"))
                } else {
                    onError(Throwable("unknown error"))
                }
            }


        })
    }


}


