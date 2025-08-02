// CustomListView.kt CustomListItems.kt CustomListItemModel.kt CustomListAdapter.kt
// activity_custom_list_view.xml activity_custom_list_items.xml rounded_bg.xml belong to this customlistiew

package com.example.cse226

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CustomListView : AppCompatActivity() {
    private lateinit var listView: ListView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_list_view)

        listView = findViewById(R.id.customlistview)

        val itemList = listOf(
            CustomListItemModel(R.drawable.lpulogo, "Mountain", "A beautiful mountain view."),
            CustomListItemModel(R.drawable.lpulogo, "Forest", "Lush green forest landscape."),
            CustomListItemModel(R.drawable.lpulogo, "Beach", "Relaxing sunny beach."),
            CustomListItemModel(R.drawable.lpulogo, "City", "Night skyline of a city."),
        )

        val adapter = CustomListAdapter(this, itemList)
        listView.adapter = adapter

    }
}