package com.example.the_catch

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.example.the_catch.data.Lake
import androidx.navigation.findNavController
import com.example.the_catch.databinding.LakeItemBinding
import com.google.android.material.snackbar.Snackbar

/**
 * [RecyclerView.Adapter] that can display a [Lake].
 */
class MyLakeRecyclerViewAdapter(
    private val context: Context?,
    private val values: List<Lake>,
    private val view:View
) : RecyclerView.Adapter<MyLakeRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LakeItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val resources = context?.resources
        val item = values[position]
        holder.imageButton.setImageResource(item.imageResourceId)
        holder.imageButton.setOnClickListener {
            val action = LakeFragmentDirections.actionLakeFragmentToFishFragment(lakeId = item.id)
            view.findNavController().navigate(action)
        }
        holder.imageButton.setOnLongClickListener {
            val msg = resources?.getString(R.string.lake_button_text, item.points)
            val snack = msg?.let { it1 -> Snackbar.make(it, it1, Snackbar.LENGTH_SHORT) }
            snack?.show()
            true
        }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: LakeItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val imageButton: ImageButton = binding.imageButtton
    }


}