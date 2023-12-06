package com.airpass.tp03locationserch

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class SearchRecyclerAdapter:RecyclerView.Adapter<> {

    class SearchItemViewHolder(itemView:View, val searchResultClickListener: (Any)->Unit) : RecyclerView.ViewHolder(itemView) {
        fun binding(data:Any) = with(itemView) {

        }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }



}