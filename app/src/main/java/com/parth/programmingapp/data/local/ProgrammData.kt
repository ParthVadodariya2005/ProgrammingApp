package com.parth.programmingapp.data.local



import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.parth.programmingapp.data.local.dao.HeroDao
import com.parth.programmingapp.data.local.dao.HeroRemoteKeyDao
import com.parth.programmingapp.domain.model.Hero
import com.parth.programmingapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class,HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConvertor::class)
abstract class ProgrammData: RoomDatabase() {

   abstract fun heroDao():HeroDao
   abstract fun heroRemotekey():HeroRemoteKeyDao


}