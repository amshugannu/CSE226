package com.example.cse226

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.GridView

class GridView : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_grid_view)

        val items = listOf(
            GridDataitem( "Apple",R.drawable.apple),
            GridDataitem( "Banana",R.drawable.banana),
            GridDataitem( "Orange",R.drawable.orange),
            GridDataitem( "Mango",R.drawable.mango),
        )

        val gridView = findViewById<GridView>(R.id.myGrid)
        gridView.numColumns = 2
        gridView.adapter = GridAdapter(items)
    }
}