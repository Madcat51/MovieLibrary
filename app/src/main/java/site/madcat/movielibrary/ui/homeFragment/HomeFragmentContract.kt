package site.madcat.movielibrary.ui.homeFragment

import androidx.lifecycle.LiveData
import site.madcat.movielibrary.domain.MovieEntity

class HomeFragmentContract {

    interface HomeFragmentInterface {
        val respond: LiveData<String>


        fun onAttach(view: HomeFragment)
        fun onDetach()
        fun onMovieClick(movie: MovieEntity)

    }
}