package site.madcat.movielibrary.data

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

    private var api: RetrofitLoadRepo = retrofit.create(RetrofitLoadRepo::class.java)


    override fun getMovieSync(path: String, repo: LocalMovieRepository): String {
        TODO("Not yet implemented")
    }

    override fun getReposForUserAsync(
        userName: String,
        onSuccess: (List<ReturnPackage>) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        TODO("Not yet implemented")
    }


}