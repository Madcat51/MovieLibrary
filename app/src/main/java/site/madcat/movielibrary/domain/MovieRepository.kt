package site.madcat.movielibrary.domain

class MovieRepository : MovieLocalInterface {


    var cash: ArrayList<MovieEntity> = ArrayList<MovieEntity>()
    private var counter=0

    override val movie: List<MovieEntity?>
        get()=ArrayList(cash)

    override fun addMovie(movie: MovieEntity?) {
        val newId=++counter

        cash.add(movie!!)

    }

/*    override fun editMovie(id: Int, movie: MovieEntity?): Boolean {
        deleteMovie(id)
        movie!!.setID(id.toString())
        cash.add(movie)
        return true
    }

    override fun deleteMovie(id: Int): Boolean {
        for (i in cash.indices) {
            if (cash[i].id.equals(id)) {
                cash.removeAt(i)
                return true
            }
        }
        return false
    }*/

    fun getMovie(): Any? {
        return ArrayList<Any?>(cash)
    };


}