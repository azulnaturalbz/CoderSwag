package org.silvatech.coderswag.Services

import org.silvatech.coderswag.Model.Category
import org.silvatech.coderswag.Model.Product

object DataService {


    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )


    val hats = listOf(
        Product("ST Graphic Beanie", "$18","hat01"),
        Product("ST Hat Black", "$28","hat02"),
        Product("ST Hat White", "$18","hat03"),
        Product("ST Hat Snapback", "$22","hat04")
    )

    val hoodies = listOf(
        Product("ST Hoodie Gray","$38","hoodie01"),
        Product("ST Hoodie Red","$50","hoodie02"),
        Product("ST Hoodie Greyer","$48","hoodie03"),
        Product("ST Hoodie Black","$60","hoodie04")

    )

    val shirts = listOf(
        Product("ST Shirt Black","$10","shirt01"),
        Product("ST Shirt Light Grey","$12","shirt02"),
        Product("ST Hoodie Shirt Red","$22","shirt03"),
        Product("ST Shirt Hustle E Black","$60","shirt04"),
        Product("DSLP Kickflip Studios","$18","shirt05")

    )
}