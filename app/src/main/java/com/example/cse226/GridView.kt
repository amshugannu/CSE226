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
            GridDataitem( "Apple",R.drawable.lpulogo),
            GridDataitem( "Banana",R.drawable.lpulogo),
            GridDataitem( "Orange",R.drawable.lpulogo),
            GridDataitem( "Pineapple",R.drawable.lpulogo),
            GridDataitem( "Mango",R.drawable.lpulogo),
            GridDataitem( "Cherry",R.drawable.lpulogo),
            GridDataitem( "Kiwi",R.drawable.lpulogo),
            GridDataitem( "Water Melon",R.drawable.lpulogo),
            GridDataitem( "Grapes",R.drawable.lpulogo),
        )

        val gridView = findViewById<GridView>(R.id.grid_view)
        gridView.numColumns = 2
        gridView.adapter = GridAdapter(items)
    }
}