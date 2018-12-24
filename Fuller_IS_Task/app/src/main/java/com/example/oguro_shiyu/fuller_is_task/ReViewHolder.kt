package com.example.oguro_shiyu.fuller_is_task

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView


/**
 * Created by oguro_shiyu on 2018/12/24.
 */
class ReViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    // 独自に作成したListener
    interface ItemClickListener {
        fun onItemClick(view: View, position: Int)
    }

    val itemImageView: ImageView = view.findViewById(R.id.tweetIcon)
    val itemTextView: TextView = view.findViewById(R.id.accountName)

    init {
        // layoutの初期設定するときはココ
    }

}