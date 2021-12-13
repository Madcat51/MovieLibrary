package site.madcat.movielibrary.domain

import androidx.annotation.WorkerThread

interface GetMovieRepoInterface {
    @WorkerThread
    fun getMovieSync(path:String): List<MovieEntity> //или ReturnPackage
    fun getMovieAsync(path:String, callback:(List<MovieEntity>)->Unit)//или ReturnPackage
}