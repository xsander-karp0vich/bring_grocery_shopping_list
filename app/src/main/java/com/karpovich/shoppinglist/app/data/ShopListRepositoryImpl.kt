package com.karpovich.shoppinglist.app.data

import com.karpovich.shoppinglist.app.domain.entities.ShopItem
import com.karpovich.shoppinglist.app.domain.repository.ShopListRepository

object ShopListRepositoryImpl: ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()

    init {
        for (i in 0..20) {
            shopList.add(ShopItem("Name $i", i, true))
        }
    }
    override fun addShopItem(shopItem: ShopItem) {
        shopList.add(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldElement = getShopItem(shopItem.id)
        shopList.remove(oldElement)
        addShopItem(shopItem)
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return shopList.find {
            it.id == shopItemId
        } ?: throw RuntimeException("Element with id $shopItemId not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }

    override fun removeShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

}