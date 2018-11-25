package com.example.mizuki.firstkotlinproject.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.mizuki.firstkotlinproject.R
import com.example.mizuki.firstkotlinproject.viewholders.NewListViewHolder

class NewListRecyclerAdapter: RecyclerView.Adapter<NewListViewHolder>() {
    override fun onBindViewHolder(p0: NewListViewHolder, p1: Int) {

    }


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): NewListViewHolder {
        var view = LayoutInflater.from(p0.context).inflate(R.layout.item_view_card,p0,false)
        return NewListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

}