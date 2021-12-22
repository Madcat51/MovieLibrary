package site.madcat.movielibrary.domain

class LocalMovieRepository : LocalMovieInterface {


    var cash: ArrayList<MovieEntity> =ArrayList<MovieEntity>()
    private var counter=0

    override val movie: List<MovieEntity?>
        get()=ArrayList(cash)

    override fun addMovie(movie: MovieEntity?) {
        cash.add(movie!!)
    }


    override fun deleteMovie(id: Int): Boolean {
        for (i in cash.indices) {
            if (cash[i].id.equals(id)) {
                cash.removeAt(i)
                return true
            }
        }
        return false
    }

    fun getMovie(): Any? {
        return ArrayList<Any?>(cash)
    };


}