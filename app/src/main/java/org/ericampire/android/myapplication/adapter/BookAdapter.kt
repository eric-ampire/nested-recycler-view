package org.ericampire.android.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import org.ericampire.android.myapplication.adapter.common.CustomViewHolder
import org.ericampire.android.myapplication.databinding.ItemBookBinding
import org.ericampire.android.myapplication.entity.Book

class BookAdapter : ListAdapter<Book, CustomViewHolder>(Companion) {
    companion object : DiffUtil.ItemCallback<Book>() {
        override fun areItemsTheSame(oldItem: Book, newItem: Book): Boolean {
            return  oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Book, newItem: Book): Boolean {
            return  oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBookBinding.inflate(inflater, parent, false)

        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val currentBook = getItem(position)
        val itemBinding = holder.binding as ItemBookBinding
        itemBinding.book = currentBook
        itemBinding.executePendingBindings()
    }
}