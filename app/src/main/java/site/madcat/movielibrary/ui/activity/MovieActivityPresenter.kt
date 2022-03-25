package site.madcat.movielibrary.ui.activity

import android.Manifest
import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.app.Activity
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.PermissionChecker
import androidx.lifecycle.MutableLiveData
import site.madcat.movielibrary.App
import site.madcat.movielibrary.data.GetRetrofitMovieImpl
import site.madcat.movielibrary.domain.LocalMovieRepository
import site.madcat.movielibrary.domain.MovieEntity

private const val PERMISSION_REQUEST_CODE =5151;

class MovieActivityPresenter() : MovieActivityContract.MovieActivityInterface, AppCompatActivity() {

    private var view: MovieActivity?=null
    private lateinit var repository: LocalMovieRepository
    val getrepo: GetRetrofitMovieImpl by lazy { GetRetrofitMovieImpl() }


    override val requestResult=MutableLiveData<String>()

   /* private val targetPermissions = arrayOf(
        Manifest.permission.ACCESS_FINE_LOCATION,
        Manifest.permission.ACCESS_COARSE_LOCATION
    )*/
    private val targetPermissions = Manifest.permission.ACCESS_FINE_LOCATION

    override fun onAttach(view: MovieActivity) {
        this.view=view
        repository=(view.application as App).repository
        fillRepo()
        checkPemission(view)

    }


    fun checkPemission(activity: Activity){
        val permissionRes=ContextCompat.checkSelfPermission(activity,targetPermissions)
        if (permissionRes!= PermissionChecker.PERMISSION_GRANTED)  {
            ActivityCompat.requestPermissions(activity, arrayOf(targetPermissions),PERMISSION_REQUEST_CODE)
        }
    }




    override fun fillRepo() {
        getrepo.getMovieAsync(
            onSuccess={
                val result: List<MovieEntity>?=it.results
                repository.clear()
                result?.forEach {
                    repository.addMovie(it)
                }
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



