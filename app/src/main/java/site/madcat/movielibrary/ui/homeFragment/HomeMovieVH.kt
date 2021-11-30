package site.madcat.movielibrary.ui.home


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import site.madcat.movielibrary.R


class HomeMovieVH(itemView: View) : RecyclerView.ViewHolder(itemView) {


    @JvmField
    var movieImage=itemView.findViewById<ImageView>(R.id.movie_image_image_view)
    var titleTextView=itemView.findViewById<TextView>(R.id.title_text_view)
    var releasedTextView=itemView.findViewById<TextView>(R.id.released_detail_text_view)
}


