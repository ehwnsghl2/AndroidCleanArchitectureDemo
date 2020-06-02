package com.brandjunhoe.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.brandjunhoe.local.dao.ReposDao
import com.brandjunhoe.local.model.ReposEntity


@Database(
    entities = [ReposEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase:RoomDatabase(){

    abstract fun getRepos() :ReposDao

    /*companion object {
        const val DB_VERSION = 1
        private const val DB_NAME = "Repos.db"

        @Volatile
        private var INSTANCE: AppDB? = null

        fun getInstance(context: Context): AppDB =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: build(context).also { INSTANCE = it }
            }

        private fun build(context: Context) =
            Room.databaseBuilder(
                context.applicationContext, AppDB::class.java,
                DB_NAME
            ).addMigrations(MIGRATION_1_TO_2)
                .build()

        *//*마이그레이션*//*
        private val MIGRATION_1_TO_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {

            }
        }
    }*/
}