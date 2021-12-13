package site.madcat.movielibrary.domain

import java.io.Serializable

interface MovieLocalInterface : Serializable {
    val movie: List<MovieEntity?>?
    fun addMovie(movie: MovieEntity?): String
    fun editMovie(id: Int, movie: MovieEntity?): Boolean
    fun deleteMovie(id: Int): Boolean
}