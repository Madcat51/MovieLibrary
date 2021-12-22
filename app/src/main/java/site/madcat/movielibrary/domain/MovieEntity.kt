package site.madcat.movielibrary.domain

import java.io.Serializable

data class ReturnPackage (

    val page : Int,
    val results : List<MovieEntity>,
    val total_pages : Int,
    val total_results : Int
)
data class MovieEntity (

    val adult : Boolean,
    val id : Int,
    val original_language : String,
    val original_title : String,
    val overview : String,
    val popularity : Double,
    val poster_path : String,
    val release_date : String,
    val title : String,
    val video : Boolean,
    val vote_average : Double,
    val vote_count : Int
) : Serializable{
    fun setID(id: String): String {
        return id
    }}



