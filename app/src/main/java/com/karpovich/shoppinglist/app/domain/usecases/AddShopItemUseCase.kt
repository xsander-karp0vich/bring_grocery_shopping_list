package com.karpovich.shoppinglist.app.domain.usecases

import com.karpovich.shoppinglist.app.domain.entities.ShopItem
import com.karpovich.shoppinglist.app.domain.repository.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}