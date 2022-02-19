package com.example.the_catch

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import com.example.the_catch.placeholder.PlaceholderContent.PlaceholderItem
import com.example.the_catch.databinding.FishItemBinding
import com.example.the_catch.model.Fish
import org.w3c.dom.Text

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyFishRecyclerViewAdapter(
    private val context: Context?,
    private val values: List<Fish>
) : RecyclerView.Adapter<MyFishRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FishItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val resources = context?.resources
        val item = values[position]
        holder.nameView?.text = item.name
        holder.imageView?.setImageResource(item.imageResourceId)
        holder.alt?.text = resources?.getString(R.string.alt_text, item.alt)
        holder.button?.text = resources?.getString(R.string.fish_button_text, item.price)
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FishItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val nameView: TextView = binding.name
        val imageView: ImageView = binding.imageView
        val button: Button = binding.button
        val alt: TextView = binding.alt

    }

}