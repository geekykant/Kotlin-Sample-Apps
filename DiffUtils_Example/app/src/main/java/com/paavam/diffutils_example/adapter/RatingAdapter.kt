package com.paavam.diffutils_example.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.paavam.diffutils_example.R
import com.paavam.diffutils_example.model.Rating
import com.paavam.diffutils_example.utils.RatingDiffCallback

class RatingAdapter : RecyclerView.Adapter<RatingAdapter.ViewHolder>() {
    private val ratings = ArrayList<Rating>()

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val nameText : TextView = itemView.findViewById(R.id.name_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_rating,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rating = ratings[position]
        holder.nameText.text = rating.name
    }

    fun setData(newRatings: List<Rating>){
        val diffCallback = RatingDiffCallback(ratings, newRatings)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        ratings.clear()
        ratings.addAll(newRatings)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun getItemCount(): Int = ratings.size
}