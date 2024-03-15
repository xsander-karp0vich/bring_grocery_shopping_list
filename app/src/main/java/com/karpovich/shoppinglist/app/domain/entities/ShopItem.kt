package com.karpovich.shoppinglist.app.domain.entities

data class ShopItem(
    val name: String,
    val count: Int,
    val enabled: Boolean,

    var id: Int = UNDEFINED_ID
) {

    companion object {
        private const val UNDEFINED_ID = -1
    }
}
