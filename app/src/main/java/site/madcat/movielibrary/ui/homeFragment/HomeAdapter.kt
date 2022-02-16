package site.madcat.movielibrary.ui.homeFragment


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import site.madcat.movielibrary.R
import site.madcat.movielibrary.domain.MovieEntity

private const val IMAGE_PATH =
    "https://image.tmdb.org/t/p/w300/"

class HomeAdapter : RecyclerView.Adapter<HomeMovieVH>() {
    private var data: ArrayList<MovieEntity> =ArrayList<MovieEntity>()
    private var itemClickListener: IItemClickListener?=null



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeMovieVH {
        val view: View=
            LayoutInflater.from(parent.context).inflate(R.layout.group1_item_moive, parent, false)
        return HomeMovieVH(view)
    }


    override fun onBindViewHolder(holder: HomeMovieVH, position: Int) {
        val movie: MovieEntity=getItem(position)
        holder.titleTextView.text=(movie.title)
        holder.releasedTextView.text=(movie.releasedate + " " + movie.id)
        Picasso.get().load(IMAGE_PATH+movie.posterpath).into(holder.movieImage);
        holder.movieImage.setOnClickListener {
            itemClickListener?.onItemClickListener(movie)
        }
    }

    override fun getItemCount()=data.size

    fun setData(data: List<MovieEntity?>) {
        this.data=data as ArrayList<MovieEntity>
    }

    private fun getItem(position: Int): MovieEntity {
        return data[position]
    }

    fun setOnItemClickListener(itemClickListener: IItemClickListener) {
        this.itemClickListener=itemClickListener
    }


    interface IItemClickListener {
        fun onItemClickListener(movie: MovieEntity)
    }

}
