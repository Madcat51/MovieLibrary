package site.madcat.movielibrary.ui.activity

import site.madcat.movielibrary.domain.MovieEntity

class MovieActivityContract {
    interface MovieActivityInterface {
        fun onAttach(view: MovieActivity)
        fun onDetach()
fun getMovie()
    }
}