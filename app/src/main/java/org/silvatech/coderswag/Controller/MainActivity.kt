package org.silvatech.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.silvatech.coderswag.Adapters.CategoryAdapter
import org.silvatech.coderswag.Model.Category
import org.silvatech.coderswag.R
import org.silvatech.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataService.categories)

        categoryLV.adapter = adapter
    }
}
