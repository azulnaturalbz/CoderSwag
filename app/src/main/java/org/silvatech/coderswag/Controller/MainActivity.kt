package org.silvatech.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.silvatech.coderswag.Adapters.CategoryAdapter
import org.silvatech.coderswag.Adapters.CategoryRecycleAdapter
import org.silvatech.coderswag.Model.Category
import org.silvatech.coderswag.R
import org.silvatech.coderswag.Services.DataService
import org.silvatech.coderswag.Utilities.EXTRA_CATEGORY

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) {category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)

        }

        categoryLV.adapter = adapter

        val layoutManager = LinearLayoutManager(this)

        categoryLV.layoutManager = layoutManager

        categoryLV.setHasFixedSize(true)



    }
}
