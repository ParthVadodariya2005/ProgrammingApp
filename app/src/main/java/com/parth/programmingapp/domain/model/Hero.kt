package com.parth.programmingapp.domain.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.parth.programmingapp.util.Constants.HERO_DATATABLE

@Entity(tableName = HERO_DATATABLE)
data class Hero(
    @PrimaryKey(autoGenerate = false)
    val id : Int,
    val name: String,
    val image: String,
    val about:String,
    val rating:Double,
    val use:String,
    val type:String,
    val invantion:List<String>,
    val purpose:List<String>

)
