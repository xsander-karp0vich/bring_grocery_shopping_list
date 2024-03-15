package com.karpovich.shoppinglist.app.presentation.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karpovich.shoppinglist.app.data.ShopListRepositoryImpl
import com.karpovich.shoppinglist.app.domain.entities.ShopItem
import com.karpovich.shoppinglist.app.domain.usecases.AddShopItemUseCase
import com.karpovich.shoppinglist.app.domain.usecases.EditShopItemUseCase
import com.karpovich.shoppinglist.app.domain.usecases.GetShopItemUseCase
import com.karpovich.shoppinglist.app.domain.usecases.GetShopListUseCase
import com.karpovich.shoppinglist.app.domain.usecases.RemoveShopItemUseCase

class MainViewModel: ViewModel() {
    private val repository = ShopListRepositoryImpl
    private val getShopListUseCase = GetShopListUseCase(repository)
    private val getShopItemUseCase = GetShopItemUseCase(repository)
    private val addShopItemUseCase = AddShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)
    private val removeShopItemUseCase = RemoveShopItemUseCase(repository)

    val shopList = MutableLiveData<List<ShopItem>>()

    init {
        getShopList()
    }
    private fun getShopList() {
        shopList.value = getShopListUseCase.getShopList()
    }
}