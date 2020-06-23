package org.ericampire.android.myapplication.adapter.common

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import org.ericampire.android.myapplication.adapter.BookAdapter
import org.ericampire.android.myapplication.entity.Book

@BindingAdapter(value = ["setBooks", "setBookListener"])
fun RecyclerView.setRowBook(books: List<Book>?, listener: ItemClickListener<Book>?) {
    if (books != null && listener != null) {
        val bookAdapter = BookAdapter(listener)
        bookAdapter.submitList(books)

        adapter = bookAdapter
    }
}