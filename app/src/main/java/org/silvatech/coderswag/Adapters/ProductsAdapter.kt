package org.silvatech.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import org.silvatech.coderswag.Model.Product
import org.silvatech.coderswag.R

class ProductsAdapter(val context: Context, val products: List<Product>) : RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent,false) //To change body of created functions use File | Settings | File Templates.

        return  ProductHolder(view)
    }

    override fun getItemCount(): Int {

        return products.count() //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ProductHolder?, position: Int) {

        holder?.bindProduct(products[position],context) //To change body of created functions use File | Settings | File Templates.
    }

    inner class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        val productImage = itemView?.findViewById<ImageView>(R.id.productIV)

        val productName = itemView?.findViewById<TextView>(R.id.productNameTV)

        val productPrice = itemView?.findViewById<TextView>(R.id.productPriceTV)

        fun bindProduct(product: Product, context: Context){

            val resourceId = context.resources.getIdentifier(product.image, "drawable",context.packageName)

            productImage?.setImageResource(resourceId)

            productName?.text = product.title

            productPrice?.text = product.price

        }
    }
}