package com.example.cse226

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Recycler_View : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Recycler_View_Adapter
    private lateinit var itemList: List<Recycler_View_DataItems>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)


        itemList = listOf(
            Recycler_View_DataItems(R.drawable.apple, "Apple"),
            Recycler_View_DataItems(R.drawable.banana, "Banana"),
            Recycler_View_DataItems(R.drawable.orange, "Orange"),
            Recycler_View_DataItems(R.drawable.mango, "Mango")
        )

        adapter = Recycler_View_Adapter(itemList)
        recyclerView.adapter = adapter
    }
}