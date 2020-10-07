package com.paavam.diffutils_example.repository

import com.paavam.diffutils_example.model.Rating

object DataSource {

    val ratingList : List<Rating>
        get() {
            val ratings = ArrayList<Rating>()
            ratings.add(Rating(1, 10, "Mindorks"))
            ratings.add(Rating(2, 12, "AfterAcademy"))
            ratings.add(Rating(3, 5, "blog.mindorks.com"))
            return ratings
        }

    val ratingList2 : List<Rating>
        get() {
            val ratings = ArrayList<Rating>()
            ratings.add(Rating(4, 10, "1212"))
            ratings.add(Rating(5, 12, "111"))
            ratings.add(Rating(6, 5, "blog.mindorks.com"))
            return ratings
        }
}