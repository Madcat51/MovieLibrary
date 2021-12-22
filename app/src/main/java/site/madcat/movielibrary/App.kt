package site.madcat.movielibrary

import android.app.Application
import android.content.Context
import site.madcat.movielibrary.domain.LocalMovieRepository

class App : Application() {
  //  val repository:GetJSONMovieInterface by lazy {GetJSONMovieImpl()}
    val repository=LocalMovieRepository()
}

val Context.app
    get()=applicationContext as App