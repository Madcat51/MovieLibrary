package site.madcat.movielibrary.ui.homeFragment


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import site.madcat.movielibrary.App
import site.madcat.movielibrary.domain.LocalMovieRepository
import site.madcat.movielibrary.domain.MovieEntity
import site.madcat.movielibrary.ui.home.HomeAdapter


class HomeFragmentPresenter() : ViewModel(), HomeFragmentContract.HomeFragmentInterface,
    HomeAdapter.IItemClickListener {
    override val respond=MutableLiveData<String>()
    private var view: HomeFragment?=null
    lateinit var repository: LocalMovieRepository


    override fun onAttach(view: HomeFragment) {
        this.view=view
        repository=(view.requireActivity().application as App).repository
    }

    override fun onDetach() {
        view=null
    }

    override fun onMovieClick(movie: MovieEntity) {
        var title=movie.title
        respond.postValue(title)
    }


    override fun onItemClickListener(movie: MovieEntity) {}


}

