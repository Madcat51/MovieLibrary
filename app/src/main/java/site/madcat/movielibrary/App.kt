package site.madcat.movielibrary

import android.app.Application
import site.madcat.movielib.domain.MovieRepository

class App:Application() {
val repository=MovieRepository()


}