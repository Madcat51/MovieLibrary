package site.madcat.movielibrary.ui.activity



import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData


import site.madcat.movielibrary.App

import site.madcat.movielibrary.data.GetMovieImpl
import site.madcat.movielibrary.domain.LocalMovieRepository


class MovieActivityPresenter() : MovieActivityContract.MovieActivityInterface, AppCompatActivity() {
    private var view: MovieActivity?=null
    private lateinit var repository: LocalMovieRepository


    val getrepo: GetMovieImpl by lazy { GetMovieImpl() }
    val urlPath: String=
        "https://api.themoviedb.org/3/discover/movie?&sort_by=popularity.desc&api_key=b46aa2f69329d4b3b5e8d2e1ea6b7886"
    override val requestResult=MutableLiveData<String>()


    override fun onAttach(view: MovieActivity) {
        this.view=view
        repository=(view.application as App).repository
        fillRepo()
    }

    override fun fillRepo(){
        Thread {
            var res=getrepo.getMovieSync(urlPath, repository)
            runOnUiThread {requestResult.postValue(res.toString())}
            }.start()
    }


    override fun onDetach() {
        view=null
    }

    override fun getMovie() {
    }


}



