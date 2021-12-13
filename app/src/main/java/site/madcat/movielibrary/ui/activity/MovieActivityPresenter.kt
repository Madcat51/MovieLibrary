package site.madcat.movielibrary.ui.activity


import com.google.gson.Gson
import site.madcat.movielibrary.domain.MovieEntity
import site.madcat.movielibrary.domain.MovieRepository
import site.madcat.movielibrary.App
import java.util.*


class MovieActivityPresenter : MovieActivityContract.MovieActivityInterface {
    private var view: MovieActivity?=null
    private lateinit var repository: MovieRepository
    val urlPath: String="https://api.themoviedb.org/3/discover/movie?&sort_by=popularity.desc&api_key=b46aa2f69329d4b3b5e8d2e1ea6b7886"
    private val gson by lazy { Gson() }





    override fun onAttach(view: MovieActivity) {
        this.view=view
        repository=(view.application as App).repository

    }
    override fun onDetach() {
        view=null
    }









    override fun fillRepository(movieEntity: MovieEntity) {
            repository.addMovie(movieEntity!!)
    }


}