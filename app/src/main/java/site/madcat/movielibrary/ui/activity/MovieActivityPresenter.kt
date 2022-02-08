package site.madcat.movielibrary.ui.activity


import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData


import site.madcat.movielibrary.App

import site.madcat.movielibrary.data.GetRetrofitMovieImpl
import site.madcat.movielibrary.domain.LocalMovieRepository


class MovieActivityPresenter() : MovieActivityContract.MovieActivityInterface, AppCompatActivity() {
    private var view: MovieActivity?=null
    private lateinit var repository: LocalMovieRepository


    val getrepo: GetRetrofitMovieImpl by lazy { GetRetrofitMovieImpl() }

    val urlPath: String=
        "https://api.themoviedb.org/3/discover/movie?&sort_by=popularity.desc&api_key=b46aa2f69329d4b3b5e8d2e1ea6b7886"
    override val requestResult=MutableLiveData<String>()


    override fun onAttach(view: MovieActivity) {
        this.view=view
        repository=(view.application as App).repository
        fillRepo()

    }


    override fun fillRepo() {
        getrepo.getMovieAsync(repository,
            onSuccess={
                view!!.binding.textView.text="Ok"
            },
            onError={
                runOnUiThread {
                    view!!.binding.textView.text="error"

                }
            }

        )


    }


    override fun onDetach() {
        view=null
    }

    override fun getMovie() {
    }


}



