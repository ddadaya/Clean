package com.example.myapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.domain.ShopItem

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.shopList.observe(this){
            Log.d("CHECK",it.toString())
        }
        //viewModel.getShopList()
        val shopItem = ShopItem("Name 0",0,true,0)
        val shopItem1 = ShopItem("Name 1",1,true,1)
        //viewModel.deleteShopItem(shopItem)
//        viewModel.getShopList()
        viewModel.changeEnableState(shopItem1)
        viewModel.getShopList()
    }
}