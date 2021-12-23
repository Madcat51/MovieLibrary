package site.madcat.movielibrary.ui.activity

import androidx.lifecycle.MutableLiveData


class MovieActivityContract {
    enum class State { OK, ERROR }

    interface MovieActivityInterface {
        val requestResult:MutableLiveData<String>

        fun onAttach(view: MovieActivity)
        fun onDetach()
        fun getMovie()
    }
}