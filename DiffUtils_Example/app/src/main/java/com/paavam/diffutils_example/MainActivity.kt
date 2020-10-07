package com.paavam.diffutils_example

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.paavam.diffutils_example.adapter.RatingAdapter
import com.paavam.diffutils_example.model.Rating
import com.paavam.diffutils_example.repository.DataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupList()

        object : CountDownTimer(5000, 1000){
            override fun onTick(p0: Long) {
            }

            override fun onFinish() {
                val adapter = recycler_view.adapter as RatingAdapter
                val newList = ArrayList<Rating>()
                newList.addAll(DataSource.ratingList)
                newList.addAll(DataSource.ratingList2)
                adapter.setData(newList)
            }

        }.start()
    }

    private fun setupList() {
        val ratingAdapter = RatingAdapter()
        recycler_view.adapter = ratingAdapter
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.itemAnimator = DefaultItemAnimator()
        ratingAdapter.setData(DataSource.ratingList)
    }
}