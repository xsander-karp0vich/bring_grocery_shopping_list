package com.karpovich.shoppinglist.app.domain.repository

import androidx.lifecycle.LiveData
import com.karpovich.shoppinglist.app.domain.entities.ShopItem

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>

    fun removeShopItem(shopItem: ShopItem)
}