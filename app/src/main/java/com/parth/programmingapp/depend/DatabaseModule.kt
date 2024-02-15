package com.parth.programmingapp.depend



import android.content.Context
import androidx.room.Room
import com.parth.programmingapp.data.local.ProgrammData
import com.parth.programmingapp.util.Constants.PROGRAMM_DATA
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {
     @Provides
     @Singleton

    fun provideDatabase(

      @ApplicationContext context: Context)
      = Room.databaseBuilder(context,ProgrammData::class.java,PROGRAMM_DATA).build()
}