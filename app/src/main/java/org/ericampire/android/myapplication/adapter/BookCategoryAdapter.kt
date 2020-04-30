package org.ericampire.android.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.ericampire.android.myapplication.adapter.common.CustomViewHolder
import org.ericampire.android.myapplication.databinding.ItemBookCategoryBinding
import org.ericampire.android.myapplication.entity.*

class BookCategoryAdapter : ListAdapter<BookCategory, CustomViewHolder>(Companion) {
    private val viewPool = RecyclerView.RecycledViewPool()

    companion object : DiffUtil.ItemCallback<BookCategory>() {
        override fun areItemsTheSame(oldItem: BookCategory, newItem: BookCategory): Boolean {
            return  oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: BookCategory, newItem: BookCategory): Boolean {
            return  oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBookCategoryBinding.inflate(inflater, parent, false)

        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val currentBookCategory = getItem(position)
        val itemBinding = holder.binding as ItemBookCategoryBinding

        itemBinding.bookCategory = currentBookCategory
        itemBinding.nestedRecyclerView.setRecycledViewPool(viewPool)
        itemBinding.executePendingBindings()
    }
}