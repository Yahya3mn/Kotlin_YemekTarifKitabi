package com.example.myapplication.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.model.Tarif

@Database(entities = [Tarif::class], version = 1)
abstract class TarifDatabase : RoomDatabase() {
    abstract fun TarifDao(): TarifDAO
}