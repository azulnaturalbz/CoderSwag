package org.silvatech.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.silvatech.coderswag.Model.Category
import org.silvatech.coderswag.R

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView:View

        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)

        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryIV)

        val categoryName : TextView = categoryView.findViewById(R.id.categoryTV)

        val category = categories[position]

        val resourceid = context.resources.getIdentifier(category.image,"drawable",context.packageName)

        categoryImage.setImageResource(resourceid)

        categoryName.text = category.title

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]//To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(position: Int): Long {
        return 0 //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        return categories.count()//To change body of created functions use File | Settings | File Templates.
    }
}