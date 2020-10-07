package com.paavam.diffutils_example.utils

import androidx.annotation.Nullable
import androidx.recyclerview.widget.DiffUtil
import com.paavam.diffutils_example.model.Rating

class RatingDiffCallback(private val oldList:List<Rating>, private val newList: List<Rating>): DiffUtil.Callback(){
    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].rateIndex == newList[newItemPosition].rateIndex
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val (_, value, name) = oldList[oldItemPosition]
        val (_, value1, name1) = newList[oldItemPosition]

        return name == name1 && value == value1
    }

    @Nullable
    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        return super.getChangePayload(oldItemPosition, newItemPosition)
    }
}