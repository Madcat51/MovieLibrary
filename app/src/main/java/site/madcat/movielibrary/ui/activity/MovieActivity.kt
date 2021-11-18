package site.madcat.movielibrary.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import site.madcat.movielibrary.R
import site.madcat.movielibrary.databinding.ActivityMainBinding


class MovieActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var movieActivityPresenter=MovieActivityPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navView: BottomNavigationView=binding.navView
        val navController=findNavController(R.id.fragment_container)
        navView.setupWithNavController(navController)
        movieActivityPresenter.onAttach(this)

        movieActivityPresenter.fillRepository()//(заполняем, временно)
    }
}