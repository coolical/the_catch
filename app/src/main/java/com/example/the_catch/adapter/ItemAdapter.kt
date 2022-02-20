package com.example.myapplication.adapter

import android.content.ClipData
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.the_catch.R
import com.example.the_catch.data.Lake

class ItemAdapter (private val context: Context,
                   private val dataset: List<Lake>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.image_item)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.location_items, parent, false)

        return ItemViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)
        holder.imageView.setOnClickListener{
            val queryUrl: Uri = Uri.parse("https://www.google.com/search?q=Galveston+Bay&oq=g&aqs=chrome.2.69i60j69i59l2j69i60l4j69i65.1574j0j9&sourceid=chrome&ie=UTF-8")
            val intent = Intent(Intent.ACTION_VIEW, queryUrl)
            context.startActivity(intent)

        }
    }

    override fun getItemCount() = dataset.size

}