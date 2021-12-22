package site.madcat.movielibrary.ui.activity


import android.content.res.Configuration
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
import site.madcat.movielibrary.app
import site.madcat.movielibrary.domain.GetJSONMovieInterface


class MovieActivity : AppCompatActivity(), HomeFragment.Controller {


    private lateinit var binding: ActivityMainBinding
    private var movieActivityPresenter=MovieActivityPresenter()
    private var fragmentManager: FragmentManager=supportFragmentManager
    private lateinit var bottomNavigationItemView: BottomNavigationView
    private lateinit var baseSnackView: View
    
    val repository: GetJSONMovieInterface by lazy { app.repository }

    val urlPath: String=
        "https://api.themoviedb.org/3/discover/movie?&sort_by=popularity.desc&api_key=b46aa2f69329d4b3b5e8d2e1ea6b7886"

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

        Thread {
            repository.getMovieSync(urlPath)
        }.start()


       // movieActivityPresenter.getMovie()
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
                    loadFragment(HomeFragment())
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



    fun View.showSnackBar(
        text: String,
        action: View,
        length: Int=Snackbar.LENGTH_SHORT
    ) {
        Snackbar.make(this, text, length).show()
    }

}