package com.example.guldana.aboutfragment

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.*
import kotlin.concurrent.thread
import android.os.AsyncTask.execute
import android.provider.ContactsContract.CommonDataKinds.Note
import android.R.attr.button
import android.provider.ContactsContract.CommonDataKinds.Organization





class FirstFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val todo = Todo(1, "Wash", "Clean", false)
        val todos = ArrayList<Todo>()
        todos.add(todo)

        AppDatabase db = MyAp



        val adapter = ListAdapter(todos)
        val recycler_view = view.findViewById(R.id.recycler) as RecyclerView
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            recycler_view.layoutManager = GridLayoutManager(activity, 2)
        } else {
            recycler_view.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        }
        recycler_view.adapter = adapter

        return view


    }



}