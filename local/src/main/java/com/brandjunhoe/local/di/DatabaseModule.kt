package com.brandjunhoe.local.di

import android.content.Context
import androidx.room.Room
import com.brandjunhoe.local.AppDatabase
import com.brandjunhoe.local.dao.ReposDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DatabaseModule {

   /* @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application
    }*/

    @Provides
    @Singleton
    fun provideAppDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder<AppDatabase>(context, AppDatabase::class.java, "repos.db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideReposDao(database: AppDatabase): ReposDao {
        return database.getRepos()
    }

}
