package com.example.getiruygulamasi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_recycler_view.view.*

class GetirAdapter(var model: List<Model>) : RecyclerView.Adapter<GetirAdapter.GetirViewHolder>() {

    inner class GetirViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GetirViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view, parent, false)
        return GetirViewHolder(view)
    }

    override fun onBindViewHolder(holder: GetirViewHolder, position: Int) {
        holder.itemView.text_view_siparis.text = model[position].title
        holder.itemView.text_view_description.text = model[position].description
        holder.itemView.getir_image.setImageBitmap(model[position].bitmap)


    }

    override fun getItemCount(): Int {
        return model.size
    }
}