package com.johnstrack.trailguide.Controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.johnstrack.trailguide.Adapter.CategoryRecycleAdapter
import com.johnstrack.trailguide.R
import com.johnstrack.trailguide.Services.DataService
import com.johnstrack.trailguide.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Number of categories: ${DataService.categories.count()}")

        adapter = CategoryRecycleAdapter(this, DataService.categories) {category ->
            val itemIntent = Intent (this, CategoryItemsActivity::class.java)
            itemIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(itemIntent)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager (this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }

    fun hamburgerMenuClicked (view: View) {
        val intent = Intent (this, AppInfoActivity::class.java)
        startActivity(intent)
    }
}