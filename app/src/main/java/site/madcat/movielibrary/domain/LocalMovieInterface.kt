package site.madcat.movielibrary.domain

import java.io.Serializable

interface LocalMovieInterface : Serializable {
    val movie: List<MovieEntity?>?
    fun addMovie(movie: MovieEntity?)
    fun deleteMovie(id: Int): Boolean
}