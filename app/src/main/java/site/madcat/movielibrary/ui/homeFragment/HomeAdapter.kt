package site.madcat.movielibrary.ui.home


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import site.madcat.movielibrary.R
import site.madcat.movielibrary.domain.Movie


class HomeAdapter : RecyclerView.Adapter<HomeMovieVH>() {
    private var data: MutableList<Movie> = ArrayList<Movie>()

    private var itemClickListener: IItemClickListener?=null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeMovieVH {
        val view: View=
            LayoutInflater.from(parent.context).inflate(R.layout.item_move, parent, false)
        return HomeMovieVH(view)
    }

    override fun getItemCount()=data.size

    override fun onBindViewHolder(holder: HomeMovieVH, position: Int) {
        val movie: Movie=getItem(position)
        holder.titleTextView.text=(movie.title)
        holder.releasedTextView.text=(movie.released + " " + movie.id)
        holder.movieImage.setOnClickListener {
            itemClickListener!!.onItemClickListener(movie)
        }
    }

    fun setData(data: List<Movie?>) {
        this.data=data as MutableList<Movie>
    }

    private fun getItem(position: Int): Movie {
        return data[position]
    }

    fun setOnItemClickListener(itemClickListener: IItemClickListener) {
        this.itemClickListener=itemClickListener
    }

    interface IItemClickListener {
        fun onItemClickListener(movie: Movie)
    }
}