package site.madcat.movielibrary.ui.home


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import site.madcat.movielibrary.R
import site.madcat.movielibrary.databinding.ActivityMainBinding
import site.madcat.movielibrary.databinding.FragmentHomeBinding
import site.madcat.movielibrary.databinding.Group1ItemMoiveBinding

class HomeMovieVH(itemView: View) : RecyclerView.ViewHolder(itemView) {


    @JvmField
    var movieImage=itemView.findViewById<ImageView>(R.id.movie_image_image_view)
    var titleTextView=itemView.findViewById<TextView>(R.id.title_text_view)
    var releasedTextView=itemView.findViewById<TextView>(R.id.released_detail_text_view)
}


