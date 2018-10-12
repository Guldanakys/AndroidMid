package com.example.guldana.aboutfragment

import android.app.Application
import android.arch.persistence.room.Room

class MyApp : Application() {

    lateinit var database: AppDatabase

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(applicationContext,
                AppDatabase::class.java,
                "AppDatabase")
                .fallbackToDestructiveMigration()
                .build()
    }

}