package com.example.madlevel4task1

import androidx.room.*

@Dao
interface ProductDao {

    @Query("SELECT * FROM product_table")
    suspend fun getAllProduct(): List<Product>

    @Insert
    suspend fun insertProduct(product: Product)

    @Delete
    suspend fun deleteProduct(product: Product)

    @Update
    suspend fun updateProduct(product: Product)

}
