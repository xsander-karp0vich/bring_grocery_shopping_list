package com.karpovich.shoppinglist.app.domain.usecases

import com.karpovich.shoppinglist.app.domain.entities.ShopItem
import com.karpovich.shoppinglist.app.domain.repository.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}