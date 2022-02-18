package com.example.the_catch

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import com.example.the_catch.placeholder.PlaceholderContent.PlaceholderItem
import com.example.the_catch.databinding.LocationItemBinding
import com.example.the_catch.model.Location

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyLocationRecyclerViewAdapter(
    private val values: List<Location>
) : RecyclerView.Adapter<MyLocationRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LocationItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.nameView.text = item.name
        holder.imageView.setImageResource(item.imageResourceId)
        holder.button
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: LocationItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val nameView: TextView = binding.name
        val imageView: ImageView = binding.imageView
        val button: Button = binding.button
    }

}