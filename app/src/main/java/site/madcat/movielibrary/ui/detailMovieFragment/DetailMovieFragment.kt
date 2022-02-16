package site.madcat.movielibrary.ui.detailMovieFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.squareup.picasso.Picasso
import site.madcat.movielibrary.R
import site.madcat.movielibrary.databinding.FragmentDetailMovieBinding
import site.madcat.movielibrary.domain.MovieEntity


private const val IMAGE_PATH =
    "https://image.tmdb.org/t/p/w500/"
class DetailMovieFragment : Fragment() {
    private val binding by viewBinding(FragmentDetailMovieBinding::bind)
    private lateinit var titleTextView: TextView
    private lateinit var detailTextView: TextView
    private lateinit var yearTextView: TextView
    private lateinit var ratingTextView: TextView
    private lateinit var movieImageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun initialsView() {
        titleTextView=binding.titleMovieTextView
        detailTextView=binding.detailMovieTextView
        yearTextView=binding.yearMovieTextView
        ratingTextView=binding.raitingMovieTextView


        movieImageView=binding.imageView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialsView()
        getParams()
    }

    private fun getParams() {
        val argument=arguments
        val movie: MovieEntity?=argument?.getSerializable(MovieEntity::class.java.getSimpleName()) as MovieEntity?
        getMovieDetail(movie)
    }


    private fun getMovieDetail(movie: MovieEntity?) {
        titleTextView.text=movie?.title
        detailTextView.text=movie?.overview
        yearTextView.text="Релиз " + movie?.releasedate
        ratingTextView.text="Рейтинг " + movie?.popularity.toString()
        Picasso.get().load(IMAGE_PATH +movie?.posterpath).into( movieImageView);
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail_movie, container, false)
    }

    fun setInputArgumentsMovieDetailFrames(movie: MovieEntity?): DetailMovieFragment? {
        val detailMovieFragment: DetailMovieFragment=DetailMovieFragment()
        val bundle=Bundle()
        bundle.putSerializable(MovieEntity::class.java.getSimpleName(), movie!!)
        detailMovieFragment.setArguments(bundle)
        return detailMovieFragment
    }
}