package site.madcat.movielibrary.ui.activity


import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import site.madcat.movielibrary.App
import site.madcat.movielibrary.data.GetJSONMovieImpl
import site.madcat.movielibrary.domain.LocalMovieRepository

class MovieActivityPresenter : MovieActivityContract.MovieActivityInterface, AppCompatActivity() {

    private var view: MovieActivity?=null
    private lateinit var repository: LocalMovieRepository
    val getrepo: GetJSONMovieImpl by lazy { GetJSONMovieImpl() }
    val urlPath: String=
        "https://api.themoviedb.org/3/discover/movie?&sort_by=popularity.desc&api_key=b46aa2f69329d4b3b5e8d2e1ea6b7886"


    override fun onAttach(view: MovieActivity) {
        this.view=view
        repository=(view.application as App).repository
        Thread {
         var res=getrepo.getMovieSync(urlPath, repository)
            runOnUiThread { view.bottomNavigationItemView.showSnackBar(res,view.bottomNavigationItemView) }
        }.start()
    }

    override fun onDetach() {
        view=null
    }

    override fun getMovie() {
    }

    fun View.showSnackBar(
        text: String,
        action: View,
        length: Int=Snackbar.LENGTH_SHORT
    ) {
        Snackbar.make(this, text, length).show()
    }
}


