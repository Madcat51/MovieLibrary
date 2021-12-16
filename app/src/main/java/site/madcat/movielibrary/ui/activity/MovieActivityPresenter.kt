package site.madcat.movielibrary.ui.activity


import com.google.gson.Gson
import site.madcat.movielibrary.domain.MovieEntity
import site.madcat.movielibrary.domain.MovieRepository
import site.madcat.movielibrary.App
import site.madcat.movielibrary.domain.ReturnPackage
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import java.util.*
import javax.net.ssl.HttpsURLConnection


class MovieActivityPresenter : MovieActivityContract.MovieActivityInterface {
    private var view: MovieActivity?=null
    private lateinit var repository: MovieRepository
    val urlPath: String="https://api.themoviedb.org/3/discover/movie?&sort_by=popularity.desc&api_key=b46aa2f69329d4b3b5e8d2e1ea6b7886"
    private val gson by lazy { Gson() }





    override fun onAttach(view: MovieActivity) {
        this.view=view
        repository=(view.application as App).repository

        Thread {
            val url=URL(urlPath)
            val urlConnection=url.openConnection() as HttpsURLConnection
            try {
                urlConnection.requestMethod="GET"
                urlConnection.readTimeout=5000
                val reader=BufferedReader(InputStreamReader(urlConnection.getInputStream()))//только один раз
                val resultRequest=reader.readLines().toString()
                val sBuilder=StringBuilder()

                var listResult=gson.fromJson(resultRequest, Array<ReturnPackage>::class.java)
                listResult.forEach {
                    var listMovie=it.results
                    listMovie.forEach {
                        fillRepository(it)
                       }
                }


               // runOnUiThread { binding.textView.text=sBuilder }

            } finally {
                urlConnection?.disconnect()
            }

        }.start()


    }
    override fun onDetach() {
        view=null
    }









    override fun fillRepository(movieEntity: MovieEntity) {
            repository.addMovie(movieEntity!!)
    }


}