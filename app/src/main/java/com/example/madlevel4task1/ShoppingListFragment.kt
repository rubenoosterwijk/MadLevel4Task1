package com.example.madlevel4task1

import ProductRepository
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class ShoppingListFragment : Fragment() {

    private lateinit var productRepository: ProductRepository

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        productRepository = ProductRepository(requireContext())

        initRv()
    }
}
