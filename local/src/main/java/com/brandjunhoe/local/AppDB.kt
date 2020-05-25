package com.brandjunhoe.local

import android.content.Context
import androidx.databinding.adapters.Converters
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.brandjunhoe.local.AppDB.Companion.DB_VERSION
import com.brandjunhoe.local.dao.ReposDao
import com.brandjunhoe.local.model.ReposEntity


/*RoomDB 설정*/
@Database(
    entities = [ReposEntity::class],
    version = DB_VERSION,
    exportSchema = false
)
abstract class AppDB:RoomDatabase(){

    abstract fun getRepos() :ReposDao

    /*싱글턴 패턴*/
    companion object{
        const val DB_VERSION = 1
        private const val DB_NAME ="Repos.db"

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

        /*마이그레이션*/
        private val MIGRATION_1_TO_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {

            }
        }
    }
}