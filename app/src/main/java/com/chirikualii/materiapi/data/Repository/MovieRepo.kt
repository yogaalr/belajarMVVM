package com.chirikualii.materiapi.data.Repository

import com.chirikualii.materiapi.data.model.Movie

interface MovieRepo {
    suspend fun getPopularMovie() : List<Movie>
}