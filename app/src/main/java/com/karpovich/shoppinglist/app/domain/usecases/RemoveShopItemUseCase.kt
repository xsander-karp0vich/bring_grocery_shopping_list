package com.karpovich.shoppinglist.app.domain.usecases

import com.karpovich.shoppinglist.app.domain.entities.ShopItem
import com.karpovich.shoppinglist.app.domain.repository.ShopListRepository

class RemoveShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun removeShopItem(shopItem: ShopItem) {
        shopListRepository.removeShopItem(shopItem)
    }
}