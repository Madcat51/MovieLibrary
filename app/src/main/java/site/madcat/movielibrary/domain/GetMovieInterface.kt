package site.madcat.movielibrary.domain

import androidx.annotation.WorkerThread

interface GetMovieInterface {
    @WorkerThread
    fun getMovieSync(path: String, repo: LocalMovieRepository): String



    fun getReposForUserAsync(
        userName: String,
        onSuccess: (List<ReturnPackage>) -> Unit,
        onError: (Throwable) -> Unit
    )



}