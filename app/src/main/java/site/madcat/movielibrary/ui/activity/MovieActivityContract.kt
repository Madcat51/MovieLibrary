package site.madcat.movielibrary.ui.activity

import androidx.lifecycle.MutableLiveData

class MovieActivityContract {

    interface MovieActivityInterface {
        val requestResult:MutableLiveData<String>
        fun onAttach(view: MovieActivity)
        fun fillRepo()
        fun onDetach()
        fun getMovie()
    }
}