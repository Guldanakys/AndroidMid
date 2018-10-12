package com.example.guldana.aboutfragment

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.first_list_item.view.*
class ListAdapter(var todos: List<Todo>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = todos[position].title
        holder.desc.text = todos[position].desc
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.first_list_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }


    inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {

        var title: TextView = itemView!!.title
        var desc: TextView = itemView!!.desc


    }
}