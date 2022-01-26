package site.madcat.movielibrary.ui.activity


import android.content.IntentFilter
import android.content.res.Configuration
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import site.madcat.movielibrary.R
import site.madcat.movielibrary.databinding.ActivityMainBinding
import site.madcat.movielibrary.domain.MovieEntity
import site.madcat.movielibrary.ui.detailMovieFragment.DetailMovieFragment
import site.madcat.movielibrary.ui.favoritesFragment.FavoritesFragment
import site.madcat.movielibrary.ui.homeFragment.HomeFragment
import site.madcat.movielibrary.ui.raitingFragment.RaitingFragment
import com.google.android.material.snackbar.Snackbar
import site.madcat.movielibrary.domain.MyReceiver


class MovieActivity : AppCompatActivity(), HomeFragment.Controller {

    var myReceiver=MyReceiver()
    private lateinit var binding: ActivityMainBinding
    private var movieActivityPresenter=MovieActivityPresenter()
    private var fragmentManager: FragmentManager=supportFragmentManager
    lateinit var bottomNavigationItemView: BottomNavigationView
    private val homeFragment=HomeFragment()
    private lateinit var baseSnackView: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        movieActivityPresenter.onAttach(this)
        baseSnackView=binding.LinearLayout
        if (savedInstanceState == null) {
            loadFragment(HomeFragment())
        }

        initNavigation()
        initViewModel(movieActivityPresenter)
    }

    override fun onResume() {
        super.onResume()

        val intentFilter=IntentFilter()
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION)
        registerReceiver(myReceiver, intentFilter)
    }
    override fun onPause() {
        super.onPause();
        unregisterReceiver(myReceiver);
    }
    fun getScreenOrientation(): Boolean {
        when (resources.configuration.orientation) {
            Configuration.ORIENTATION_PORTRAIT -> {
                return true
            }
            Configuration.ORIENTATION_LANDSCAPE -> {
                return false
            }
            else -> return true
        }
    }

    fun initNavigation() {
        bottomNavigationItemView=binding!!.navView
        bottomNavigationItemView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    loadFragment(homeFragment)
                }
                R.id.navigation_favorites -> {
                    loadFragment(FavoritesFragment())
                }
                R.id.navigation_raiting -> {
                    loadFragment(RaitingFragment())
                }
            }; true
        }
    }


    fun loadFragment(fragment: Fragment) {
        fragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    fun setDetailMovieFragment(movie: MovieEntity?) {
        var detailMovieFragment=DetailMovieFragment()
        fragmentManager.beginTransaction()
            .replace(
                R.id.fragment_container,
                detailMovieFragment.setInputArgumentsMovieDetailFrames(movie!!)!!
            )
            .addToBackStack(null)
            .commit()
    }

    override fun loadMovie(movie: MovieEntity?) {
        setDetailMovieFragment(movie)
    }

    private fun initViewModel(viewModel: MovieActivityContract.MovieActivityInterface) {
        viewModel.requestResult.observe(this) { state ->
            if (state.equals("OK")) {
                homeFragment.updateAdapter()
                bottomNavigationItemView.showSnackBar(state, bottomNavigationItemView)
            } else {
                bottomNavigationItemView.showSnackBar(state, bottomNavigationItemView)
            }
        }
    }

    override fun refreshMovie() {
        movieActivityPresenter.fillRepo()
    }

    fun View.showSnackBar(
        text: String,
        action: View,
        length: Int=Snackbar.LENGTH_SHORT
    ) {
        Snackbar.make(this, text, length).show()
    }
}