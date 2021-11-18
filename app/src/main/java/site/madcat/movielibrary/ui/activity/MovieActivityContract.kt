package site.madcat.movielibrary.ui.activity

class MovieActivityContract {

    interface MovieActivityInterface {

        fun onAttach(view: MovieActivity)
        fun onDetach()
        fun fillRepository()
    }
}