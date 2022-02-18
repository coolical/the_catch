package com.example.the_catch.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.the_catch.R
import com.example.the_catch.data.DataSource

/**
*   Adapter for the [RecyclerView] in [MyLocationRe]
*
 */
class LocationCardAdapter (private val locationId: String, private val context: Context) :
    RecyclerView.Adapter<LocationCardAdapter.LocationViewHolder>() {
    private val dataset = DataSource.fishs
    class LocationViewHolder(val view: View?) : RecyclerView.ViewHolder(view!!){
        val image: ImageView? = view?.findViewById(R.id.image)
        val name: TextView? = view?.findViewById(R.id.name)
        val button  = view?.findViewById<Button>(R.id.button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationViewHolder {
        var listItem = R.layout.fish_item
        val adapterLayout = LayoutInflater.from(parent.context).inflate(listItem, parent, false)
        return LocationViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: LocationViewHolder, position: Int) {
        val resources = context?.resources
        val item = dataset[position]
        holder.image?.setImageResource((item.imageResourceId))
        holder.name?.text = item.name
    }
}