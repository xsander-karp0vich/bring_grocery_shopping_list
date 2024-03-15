package com.karpovich.shoppinglist.app.domain.usecases

import com.karpovich.shoppinglist.app.domain.entities.ShopItem
import com.karpovich.shoppinglist.app.domain.repository.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}