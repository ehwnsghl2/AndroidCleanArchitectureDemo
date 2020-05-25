package com.brandjunhoe.local.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.brandjunhoe.local.AppDB
import com.brandjunhoe.local.dao.ReposDao
import com.brandjunhoe.local.model.ReposEntity
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
    fun provideAppDatabase(context: Context): AppDB {
        return Room.databaseBuilder<AppDB>(context, AppDB::class.java, "repos.db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideReposDao(database: AppDB): ReposDao {
        return database.getRepos()
    }

}
