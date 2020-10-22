import android.content.Context
import com.example.madlevel4task1.Product
import com.example.madlevel4task1.ProductDao
import com.example.madlevel4task1.ShoppingListRoomDatabase

class ProductRepository(context: Context) {

    private val productDao: ProductDao

    init {
        val database = ShoppingListRoomDatabase.getDatabase(context)
        productDao = database!!.productDao()
    }

    suspend fun getAllProducts(): List<Product> {
        return productDao.getAllProduct()
    }

    suspend fun insertProduct(product: Product) {
        productDao.insertProduct(product)
    }

    suspend fun deleteProduct(product: Product) {
        productDao.deleteProduct(product)
    }

}
