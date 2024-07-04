package com.example.myapplication.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Tarif(

    @ColumnInfo("isim")
    var isim: String,

    @ColumnInfo("malzeme")
    var malzeme: String,

    @ColumnInfo("gorsel")
    var gorsel: ByteArray

){
    @PrimaryKey(autoGenerate = true)
    var id = 0
}
