package site.madcat.movielibrary.domain

import androidx.annotation.WorkerThread

interface GetJSONMovieInterface {
    @WorkerThread
    fun getMovieSync(path:String): List<MovieEntity> //или ReturnPackage

}