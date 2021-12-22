package site.madcat.movielibrary.ui.activity


import androidx.appcompat.app.AppCompatActivity
import site.madcat.movielibrary.domain.MovieEntity
import site.madcat.movielibrary.App
import site.madcat.movielibrary.app
import site.madcat.movielibrary.data.GetJSONMovieImpl
import site.madcat.movielibrary.domain.GetJSONMovieInterface
import java.util.*


class MovieActivityPresenter : MovieActivityContract.MovieActivityInterface, AppCompatActivity() {

    private var view: MovieActivity?=null

    override fun onAttach(view: MovieActivity) {
        this.view=view


    }

    override fun onDetach() {
        view=null
    }

    override fun getMovie() {

    }
}