package com.shalomu.enwalletproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.shalomu.enwalletproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvEnwallet.layoutManager = LinearLayoutManager(this)

        displayItems()
}

fun displayItems() {

    val expense1 = Enwallet(R.drawable.income_trx, "Salary", "KES 40000", "1 July 2024")
    val expense2= Enwallet(R.drawable.expense_trx,"Rent", "KES 16000", "2 July 2024")
    val expense3= Enwallet(R.drawable.income_trx,"Dividends", "KES 2400", "4 July 2024")
    val expense4 = Enwallet(R.drawable.expense_trx,"Electricity", "KES 800", "5 July 2024")
    val expense5 = Enwallet(R.drawable.expense_trx,"Internet", "KES 2500", "5 July 2024")
    val expense6 = Enwallet(R.drawable.expense_trx,"Shopping", "KES 3500", "5 July 2024")
    val expense7 = Enwallet(R.drawable.expense_trx,"Bus fare", "KES 500", "11 July 2024")
    val expense8 = Enwallet(R.drawable.expense_trx,"Water bill", "KES 1200", "11 July 2024")
    val expense9 = Enwallet(R.drawable.expense_trx,"land tax", "KES 2000", "13 July 2024")

    val enwalletList = listOf(expense1, expense2, expense3, expense4, expense5, expense6, expense7, expense8, expense9)
    val enwalletAdapter = EnwalletAdapter(enwalletList)
    binding.rvEnwallet.adapter = enwalletAdapter
}
}

