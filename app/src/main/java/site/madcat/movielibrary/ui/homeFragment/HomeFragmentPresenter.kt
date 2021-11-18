package site.madcat.movielibrary.ui.homeFragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import site.madcat.movielibrary.App
import site.madcat.movielibrary.domain.Movie
import site.madcat.movielibrary.domain.MovieRepository

class HomeFragmentPresenter() : ViewModel(), HomeFragmentContract.HomeFragmentInterface {
    override val respond=MutableLiveData<String>()
    private var view: HomeFragment?=null
    lateinit var repository: MovieRepository

    override fun onAttach(view: HomeFragment) {
        this.view=view
        repository=(view.requireActivity().application as App).repository
    }

    override fun onDetach() {
        view=null
    }

    override fun onMovieClick(movie: Movie) {
        var title=movie.title
        respond.postValue(title)
    }


}