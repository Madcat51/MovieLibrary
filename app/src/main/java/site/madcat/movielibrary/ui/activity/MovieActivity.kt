package site.madcat.movielibrary.ui.activity


import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import site.madcat.movielibrary.R
import site.madcat.movielibrary.databinding.ActivityMainBinding
import site.madcat.movielibrary.domain.Movie
import site.madcat.movielibrary.ui.detailMovieFragment.DetailMovieFragment
import site.madcat.movielibrary.ui.favoritesFragment.FavoritesFragment
import site.madcat.movielibrary.ui.home.HomeAdapter
import site.madcat.movielibrary.ui.homeFragment.HomeFragment
import site.madcat.movielibrary.ui.raitingFragment.RaitingFragment


class MovieActivity : AppCompatActivity(), HomeFragment.Controller {
    private lateinit var binding: ActivityMainBinding
    private var movieActivityPresenter=MovieActivityPresenter()
    private var fragmentManager: FragmentManager=supportFragmentManager
    private lateinit var bottomNavigationItemView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        movieActivityPresenter.onAttach(this)
        movieActivityPresenter.fillRepository()//(заполняем, временно)
        initNavigation()
    }

    fun getScreenOrientation(): Boolean {
        return if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) true
        else if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) false
        else true
    }

    fun initNavigation() {
        bottomNavigationItemView=binding.navView
        loadFragment(HomeFragment())
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

    fun setDetailMovieFragment(movie: Movie?) {
         var   detailMovieFragment=DetailMovieFragment()
        fragmentManager.beginTransaction()
            .replace(R.id.fragment_container,
                detailMovieFragment.setInputArgumentsMovieDetailFrames(movie!!)!!
            )
            .addToBackStack(null)
            .commit()
    }

    override fun loadMovie(movie: Movie?) {
        setDetailMovieFragment(movie)

    }

}