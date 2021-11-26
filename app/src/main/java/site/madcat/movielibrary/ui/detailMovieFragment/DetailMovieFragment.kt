package site.madcat.movielibrary.ui.detailMovieFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import by.kirich1409.viewbindingdelegate.viewBinding
import org.w3c.dom.Text
import site.madcat.movielibrary.R
import site.madcat.movielibrary.databinding.FragmentDetailMovieBinding
import site.madcat.movielibrary.domain.Movie


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
        val movie: Movie?=argument!!.getSerializable(Movie::class.java.getSimpleName()) as Movie?
        getMovieDetail(movie)
    }

    private fun getMovieDetail(movie: Movie?) {
        titleTextView.text=movie?.title
        detailTextView.text=movie?.detail
        yearTextView.text="Релиз "+movie?.released
        ratingTextView.text="Рейтинг "+movie?.ratingFilms.toString()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail_movie, container, false)

    }

    fun setInputArgumentsMovieDetailFrames(movie: Movie?): DetailMovieFragment? {
        val detailMovieFragment: DetailMovieFragment=DetailMovieFragment()
        val bundle=Bundle()
        bundle.putSerializable(Movie::class.java.getSimpleName(), movie)
        detailMovieFragment.setArguments(bundle)
        return detailMovieFragment
    }
}