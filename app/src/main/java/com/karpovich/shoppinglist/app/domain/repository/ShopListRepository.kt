package com.karpovich.shoppinglist.app.domain.repository

import com.karpovich.shoppinglist.app.domain.entities.ShopItem

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>

    fun removeShopItem(shopItem: ShopItem)
}