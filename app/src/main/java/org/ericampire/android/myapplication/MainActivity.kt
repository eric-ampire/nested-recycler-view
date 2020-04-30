package org.ericampire.android.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.ericampire.android.myapplication.adapter.BookCategoryAdapter
import org.ericampire.android.myapplication.entity.Book
import org.ericampire.android.myapplication.entity.BookCategory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookCategoryAdapter = BookCategoryAdapter()
        bookCategoryAdapter.submitList(getData())
        outerRecyclerView.adapter = bookCategoryAdapter
    }
}

fun getData(): ArrayList<BookCategory> {
    val bookCategory = arrayListOf<BookCategory>()
    for (a in 1..5) {
        val bookList = arrayListOf<Book>()
        for(b in 1..5) {
            val book = Book("$b", "Book Title $b", R.drawable.book)
            bookList += book
        }

        bookCategory += BookCategory("$a", "Category title $a", bookList)
    }

    return bookCategory
}










