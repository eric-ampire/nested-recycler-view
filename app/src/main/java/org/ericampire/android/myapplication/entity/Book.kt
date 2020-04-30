package org.ericampire.android.myapplication.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Book(
    val id: String,
    val title: String,
    val imageRes: Int
) : Parcelable