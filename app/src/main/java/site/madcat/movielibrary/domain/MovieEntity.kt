package site.madcat.movielibrary.domain

import java.io.Serializable
import com.google.gson.annotations.SerializedName


data class ReturnPackage(

    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<MovieEntity>,
    @SerializedName("totalpages")
    val total_pages: Int,
    @SerializedName("totalresults")
    val total_results: Int
)

data class MovieEntity(
    @SerializedName("adult")
    val adult: Boolean,
    @SerializedName("id")
    val id: Int,
    @SerializedName("original_language")
    val originallanguage: String,
    @SerializedName("original_title")
    val originaltitle: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("popularity")
    val popularity: Double,
    @SerializedName("poster_path")
    val posterpath: String,
    @SerializedName("release_date")
    val releasedate: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("video")
    val video: Boolean,
    @SerializedName("vote_average")
    val voteaverage: Double,
    @SerializedName("vote_count")
    val votecount: Int

) : Serializable {


}



