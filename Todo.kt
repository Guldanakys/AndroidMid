package com.example.guldana.aboutfragment

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcel
import android.os.Parcelable

@Entity(tableName = "todo")
data class Todo(

        @PrimaryKey(autoGenerate = true) var id: Long?,

        @ColumnInfo(name = "title") var title: String,

        @ColumnInfo(name = "desc") var desc: String,

        @ColumnInfo(name = "completed_flag") var completed: Boolean = false

)