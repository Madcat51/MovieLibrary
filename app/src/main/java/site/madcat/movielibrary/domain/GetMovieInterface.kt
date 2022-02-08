package site.madcat.movielibrary.domain

import androidx.annotation.WorkerThread

interface GetMovieInterface {
    @WorkerThread
    fun getMovieSync(path: String, repo: LocalMovieRepository): String


    fun getMovieAsync(
        repo:LocalMovieRepository,
        onSuccess: (List<ReturnPackage>) -> Unit,
        onError: (Throwable) -> Unit
    )



}