package com.example.guldana.aboutfragment

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.Room
import android.content.Context


@Database(entities = arrayOf(Todo::class), version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun todoDao(): TodoDao
}
