package com.parth.programmingapp.domain.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.parth.programmingapp.util.Constants.HERO_REMOTE_KEY_DATATABLE


@Entity(tableName = HERO_REMOTE_KEY_DATATABLE)

data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false)

    val id: Int,
    val prevPage: Int?,
    val nextPage:Int?
)
