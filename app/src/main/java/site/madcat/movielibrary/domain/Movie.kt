package site.madcat.movielibrary.domain

import java.io.Serializable


class Movie
    (
    id: String,
    title: String,
    detail: String,
    released: String,
    ratingFilms: Long,
    countViews: Int,
    genreMovieId: Int
) :
    Serializable {

    var id: String
    var detail: String
    var title: String
    var released: String
    var ratingFilms: Long
    var countViews: Int
    var genreMovieId: Int

    fun setID(id: String) {
        this.id=id
    }



    /*  fun getId(): String {
          return id
      }*/

    init {
        this.id=id
        this.title=title
        this.detail=detail
        this.released=released
        this.ratingFilms=ratingFilms
        this.countViews=countViews
        this.genreMovieId=genreMovieId
    }
}
