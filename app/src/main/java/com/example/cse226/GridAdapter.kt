package com.example.cse226

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridAdapter(
    private val items: List<GridDataitem>
) : BaseAdapter() {

    override fun getCount() = items.size
    override fun getItem(position: Int) = items[position]
    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_item, parent, false)
        val item = items[position]

        val imageView = view.findViewById<ImageView>(R.id.item_image)
        val textView = view.findViewById<TextView>(R.id.item_text)

        imageView.setImageResource(item.imageResId)
        textView.text = item.name

        return view
    }
}
