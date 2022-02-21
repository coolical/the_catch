package com.example.the_catch

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.the_catch.data.DataSource
import com.example.the_catch.data.Lake
import com.example.the_catch.databinding.FishItemBinding
import com.example.the_catch.model.Fish

/**
 * [RecyclerView.Adapter] that can display a [Fish].
 */
class MyFishRecyclerViewAdapter(
    private val context: Context?,
    private val lakeId: Int
) : RecyclerView.Adapter<MyFishRecyclerViewAdapter.ViewHolder>() {

    private val filteredFish: MutableList<Fish> = mutableListOf()
    private var parentLake: Lake

    init{
        val values = DataSource.fishs
        for (fish in values){
            if (lakeId == fish.from){
                filteredFish.add(fish)
            }
        }
        val lakes = DataSource.lakes
        parentLake = lakes.first { it.id == lakeId }
    }

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
        val item = filteredFish[position]
        holder.nameView.text = resources?.getString(R.string.fish_name_price, item.name, item.price)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.alt.text = resources?.getString(R.string.alt_text, item.alt)
        holder.qty.text = resources?.getString(R.string.fish_qty, item.qty)
        holder.add.setOnClickListener {
            item.qty += 1
            holder.qty.text = resources?.getString(R.string.fish_qty, item.qty)
            parentLake.points += item.price
        }
        holder.sub.setOnClickListener {
            if (item.qty > 0) {
                item.qty -= 1
                holder.qty.text = resources?.getString(R.string.fish_qty, item.qty)
                parentLake.points -= item.price
            }
        }
    }

    override fun getItemCount(): Int = filteredFish.size

    inner class ViewHolder(binding: FishItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val nameView: TextView = binding.name
        val imageView: ImageView = binding.imageView
        val add: Button = binding.add
        val sub: Button = binding.subtract
        val alt: TextView = binding.alt
        val qty: TextView = binding.quantity
    }

}