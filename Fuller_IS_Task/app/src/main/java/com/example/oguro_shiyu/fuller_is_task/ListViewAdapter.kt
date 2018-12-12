package com.example.oguro_shiyu.fuller_is_task

import android.content.Context
import android.support.design.widget.CoordinatorLayout.Behavior.setTag
import android.view.ViewGroup
import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.BaseAdapter
import android.widget.ImageView


/**
 * Created by oguro_shiyu on 2018/12/12.
 */
class ListViewAdapter internal constructor(context: Context, private val itemLayoutId: Int,
                                           private val titles: Array<String>, private val ids: IntArray) : BaseAdapter() {

    private val inflater: LayoutInflater

    internal class ViewHolder {
        var textView: TextView? = null
        var imageView: ImageView? = null
    }

    init {
        this.inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val holder: ViewHolder
        // 最初だけ View を inflate して、それを再利用する
        if (convertView == null) {
            // activity_main.xml に list.xml を inflate して convertView とする
            convertView = inflater.inflate(itemLayoutId, parent, false)
            // ViewHolder を生成
            holder = ViewHolder()
            //holder.textView = convertView!!.findViewById(R.id.itemTextView)
            holder.imageView = convertView!!.findViewById(R.id.itemImageView)
            convertView!!.setTag(holder)
        } else {
            holder = convertView!!.getTag() as ViewHolder
        }// holder を使って再利用

        // holder の imageView にセット
        holder.imageView!!.setImageResource(ids[position])
        // 現在の position にあるファイル名リストを holder の textView にセット
        holder.textView!!.text = titles[position]

        return convertView
    }

    override fun getCount(): Int {
        // texts 配列の要素数
        return titles.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }
}