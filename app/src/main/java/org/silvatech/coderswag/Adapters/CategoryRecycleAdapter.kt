package org.silvatech.coderswag.Adapters

import android.content.Context
import android.media.Image
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.category_list_item.view.*
import org.silvatech.coderswag.Model.Category
import org.silvatech.coderswag.R

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(parent?.context)
            .inflate(R.layout.category_list_item,parent,false)//To change body of created functions use File | Settings | File Templates.
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()//To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(categories[position],context) //To change body of created functions use File | Settings | File Templates.
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryIV)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryTV)

        fun bindCategory(category: Category, context: Context){
            val resourceId = context.resources.getIdentifier(category.image,
                "drawable",context.packageName)

            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }
    }
}