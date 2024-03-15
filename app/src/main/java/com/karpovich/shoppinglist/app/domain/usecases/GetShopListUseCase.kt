package com.karpovich.shoppinglist.app.domain.usecases

import com.karpovich.shoppinglist.app.domain.entities.ShopItem
import com.karpovich.shoppinglist.app.domain.repository.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem>  {
        return shopListRepository.getShopList()
    }
}