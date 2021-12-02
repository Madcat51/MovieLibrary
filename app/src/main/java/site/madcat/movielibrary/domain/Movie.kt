package site.madcat.movielibrary.domain

import java.io.Serializable


data class Movie(
    val id: String,
    val title: String,
    val detail: String,
    val released: String,
    val ratingFilms: Long,
    val countViews: Int,
    val genreMovieId: Int
) : Serializable {


    fun setID(id: String): String {
        return id
    }


}
