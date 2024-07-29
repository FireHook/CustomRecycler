package com.firehook.customrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by firehook on 29/07/2024.
 * firehook21@gmail.com
 */

class CustomAdapter(
    private val items: List<Int>
) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return LayoutInflater.from(parent.context)
            .inflate(R.layout.item_custom_recycler, parent, false).let {
                ViewHolder(it)
            }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val textView = view.findViewById<TextView>(R.id.text_tv)
        private val parentLayout = view.findViewById<ConstraintLayout>(R.id.item_cl)

        fun bind(item: Int) {
            textView.text = item.toString()
            parentLayout.setBackgroundColor(item)
        }
    }
}