package site.madcat.movielibrary.ui.activity

import android.Manifest
import android.R
import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
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
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, targetPermissions)) {
                val builder: AlertDialog.Builder=AlertDialog.Builder(activity)
                builder.setTitle("Требуется разрешение!")
                    .setMessage("По условию ДЗ необходимо выдать разрешение на использование GPS!")
                    .setCancelable(false)
                    .setNegativeButton("Ну, ладно...",
                        DialogInterface.OnClickListener { dialog, id ->  requestPermission(activity) })
                val alert: AlertDialog=builder.create()
                alert.show()
            } else {
                requestPermission(activity)
            }
        }
    }

    fun requestPermission(activity: Activity){
        ActivityCompat.requestPermissions(activity, arrayOf(targetPermissions),PERMISSION_REQUEST_CODE)

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



