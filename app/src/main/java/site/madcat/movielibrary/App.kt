package site.madcat.movielibrary

import android.app.Application
import android.content.Context
import site.madcat.movielibrary.domain.MovieRepository

class App : Application() {
    val repository=MovieRepository()
}

val Context.app
    get()=applicationContext as App