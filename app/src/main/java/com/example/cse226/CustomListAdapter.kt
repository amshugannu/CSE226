package com.example.cse226

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class CustomListAdapter(private val context: Context, private val itemList: List<CustomListItemModel>) : BaseAdapter() {
    override fun getCount(): Int = itemList.size

    override fun getItem(position: Int): Any = itemList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val item = itemList[position]
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.activity_custom_list_items, parent, false)

        val imageView = view.findViewById<ImageView>(R.id.item_image)
        val titleView = view.findViewById<TextView>(R.id.item_title)
        val descriptionView = view.findViewById<TextView>(R.id.item_description)

        imageView.setImageDrawable(ContextCompat.getDrawable(context, item.imageResId))
        titleView.text = item.title
        descriptionView.text = item.description

        return view
    }
}