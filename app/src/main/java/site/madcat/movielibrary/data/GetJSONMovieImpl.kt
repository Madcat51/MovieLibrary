package site.madcat.movielibrary.data

import com.google.gson.Gson
import site.madcat.movielibrary.domain.GetJSONMovieInterface
import site.madcat.movielibrary.domain.LocalMovieRepository
import site.madcat.movielibrary.domain.ReturnPackage
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class GetJSONMovieImpl : GetJSONMovieInterface {
    private val gson by lazy { Gson() }


    override fun getMovieSync(path: String, repo: LocalMovieRepository): String {
        var result=String()
        val url=URL(path)
        val urlConnection=url.openConnection() as HttpsURLConnection
        try {
            urlConnection.requestMethod="GET"
            urlConnection.readTimeout=5000
            val reader=
                BufferedReader(InputStreamReader(urlConnection.getInputStream()))   //только один раз
            val resultRequest=reader.readLines().toString()
            var listResult=gson.fromJson(resultRequest, Array<ReturnPackage>::class.java)
            repo.clear()
            listResult.forEach {
                var listMovie=it.results
                listMovie.forEach {
                    repo.addMovie(it)
                }
            }
            result="ok"
        } catch (e: IOException) {
            result="ошибка"

        } finally {
            urlConnection?.disconnect()
        }
        return result
    }


}