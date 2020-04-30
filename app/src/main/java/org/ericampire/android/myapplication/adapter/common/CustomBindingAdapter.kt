package org.ericampire.android.myapplication.adapter.common

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import org.ericampire.android.myapplication.adapter.BookAdapter
import org.ericampire.android.myapplication.entity.Book

@BindingAdapter(value = ["setBooks"])
fun RecyclerView.setRowBook(books: List<Book>?) {
    if (books != null) {
        val bookAdapter = BookAdapter()
        bookAdapter.submitList(books)

        adapter = bookAdapter
    }
}