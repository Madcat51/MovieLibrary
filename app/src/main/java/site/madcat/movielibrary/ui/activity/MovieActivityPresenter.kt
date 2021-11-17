package site.madcat.movielibrary.ui.activity

import android.app.Application
import site.madcat.movielib.domain.Movie
import site.madcat.movielib.domain.MovieRepository
import site.madcat.movielibrary.App
import java.util.*


class MovieActivityPresenter:MovieActivityContract.MovieActivityInterface{
    private  var view:  MovieActivity? = null
    private lateinit var  repository: MovieRepository


    override fun Attach(view: MovieActivity) {
        this.view = view
        repository = (view.application as App).repository
    }

    override fun Detach() {
       view=null
    }

    override fun fillRepository() {
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw1","1243", 4.4.toLong(),123))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw2","1234", 4.3.toLong(),12311))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw3","1294", 4.2.toLong(),123111))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw4","1834", 4.8.toLong(),12322))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw5","2234", 4.1.toLong(),1232))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw6","3234", 4.2.toLong(),1223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw7","4234", 4.3.toLong(),12223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw8","6234", 4.9.toLong(),12333))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw1","1243", 4.4.toLong(),123))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw2","1234", 4.3.toLong(),12311))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw3","1294", 4.2.toLong(),123111))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw4","1834", 4.8.toLong(),12322))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw5","2234", 4.1.toLong(),1232))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw6","3234", 4.2.toLong(),1223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw7","4234", 4.3.toLong(),12223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw8","6234", 4.9.toLong(),12333))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw1","1243", 4.4.toLong(),123))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw2","1234", 4.3.toLong(),12311))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw3","1294", 4.2.toLong(),123111))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw4","1834", 4.8.toLong(),12322))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw5","2234", 4.1.toLong(),1232))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw6","3234", 4.2.toLong(),1223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw7","4234", 4.3.toLong(),12223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw8","6234", 4.9.toLong(),12333))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw1","1243", 4.4.toLong(),123))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw2","1234", 4.3.toLong(),12311))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw3","1294", 4.2.toLong(),123111))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw4","1834", 4.8.toLong(),12322))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw5","2234", 4.1.toLong(),1232))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw6","3234", 4.2.toLong(),1223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw7","4234", 4.3.toLong(),12223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw8","6234", 4.9.toLong(),12333))

    }

}