package site.madcat.movielibrary.ui.activity


import androidx.appcompat.app.AppCompatActivity
import site.madcat.movielibrary.domain.MovieEntity
import site.madcat.movielibrary.App
import site.madcat.movielibrary.app
import site.madcat.movielibrary.data.GetJSONMovieImpl
import site.madcat.movielibrary.domain.GetJSONMovieInterface
import site.madcat.movielibrary.domain.LocalMovieRepository
import site.madcat.movielibrary.ui.homeFragment.HomeFragment
import java.util.*


class MovieActivityPresenter : MovieActivityContract.MovieActivityInterface, AppCompatActivity() {

    private var view: MovieActivity?=null
    private lateinit var repository: LocalMovieRepository
    val getrepo: GetJSONMovieImpl by lazy {GetJSONMovieImpl()}
    val urlPath: String=
        "https://api.themoviedb.org/3/discover/movie?&sort_by=popularity.desc&api_key=b46aa2f69329d4b3b5e8d2e1ea6b7886"



    override fun onAttach(view: MovieActivity) {
        this.view=view
        repository=(view.application as App).repository
        Thread {
            getrepo.getMovieSync(urlPath,repository)
          //  runOnUiThread { adap }
        }.start()

    }

    override fun onDetach() {
        view=null
    }

    override fun getMovie() {


    }

    override fun fillRepository() {
        if (repository.cash.size == 0) {
            repository.addMovie(
                MovieEntity(
                    false,
                    12,
                    "UUID.randomUUID().toString()",
                    "1q234123412431243",
                    "Название фильма 1",
                    12.0,
                    "1243",
                    "12-12-2012",
                    "21341234",
                    false,
                    123.0,
                    5
                )
            )
        }
    }
}
