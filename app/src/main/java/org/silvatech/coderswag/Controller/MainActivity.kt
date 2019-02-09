package org.silvatech.coderswag.Controller

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

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this,DataService.categories)

        categoryLV.adapter = adapter

        val layoutManager = LinearLayoutManager(this)

        categoryLV.layoutManager = layoutManager

        categoryLV.setHasFixedSize(true)

//        categoryLV.setOnItemClickListener { adapterView, view, i, l ->
//            val category = DataService.categories[i]
//            Toast.makeText(this,"You clicked on the ${category.title} cell",Toast.LENGTH_SHORT)
//        }
    }
}
