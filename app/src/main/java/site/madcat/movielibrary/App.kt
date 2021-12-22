package site.madcat.movielibrary

import android.app.Application
import android.content.Context
import site.madcat.movielibrary.data.GetJSONMovieImpl
import site.madcat.movielibrary.domain.GetJSONMovieInterface

class App : Application() {
    val repository:GetJSONMovieInterface by lazy {GetJSONMovieImpl()}

}

val Context.app
    get()=applicationContext as App