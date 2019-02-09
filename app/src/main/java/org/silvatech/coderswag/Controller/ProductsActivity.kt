package org.silvatech.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.silvatech.coderswag.R
import org.silvatech.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
    }
}
