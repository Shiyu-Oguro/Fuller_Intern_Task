package com.example.oguro_shiyu.fuller_is_task

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerViewAccessibilityDelegate
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.oguro_shiyu.fuller_is_task.R.layout.activity_main
import com.example.oguro_shiyu.fuller_is_task.R.layout.activity_main2
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity : AppCompatActivity(), ReViewHolder.ItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hoges = resources.getStringArray(R.array.tweetData).toMutableList()

        // Kotlin Android Extensionsを使っているので、つけたIDで直接指定できる（R.id.mainRecyclerView）
        oguroRecyclerView.adapter = ReViewAdapter(this, this, hoges)
        oguroRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    override fun onItemClick(view: View, position: Int) {
        Toast.makeText(applicationContext, "position $position was tapped", Toast.LENGTH_SHORT).show()
    }
}