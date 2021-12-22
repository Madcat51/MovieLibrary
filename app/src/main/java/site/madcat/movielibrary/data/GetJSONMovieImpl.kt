package site.madcat.movielibrary.data

import com.google.gson.Gson
import site.madcat.movielibrary.domain.GetJSONMovieInterface
import site.madcat.movielibrary.domain.MovieEntity
import site.madcat.movielibrary.domain.ReturnPackage
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class GetJSONMovieImpl : GetJSONMovieInterface {
    private val gson by lazy { Gson() }


    override fun getMovieSync(path: String): List<MovieEntity> {
      val result=emptyList<MovieEntity>().toMutableList()
        val url=URL(path)
        val urlConnection=url.openConnection() as HttpsURLConnection
        try {
            urlConnection.requestMethod="GET"
            urlConnection.readTimeout=5000
            val reader=
                BufferedReader(InputStreamReader(urlConnection.getInputStream()))   //только один раз
            val resultRequest=reader.readLines().toString()
            var listResult=gson.fromJson(resultRequest, Array<ReturnPackage>::class.java)
            listResult.forEach {
                var listMovie=it.results
                listMovie.forEach {
                   result.add(it)
                }
            }

        } finally {
            urlConnection?.disconnect()
        }
        return result
    }
}