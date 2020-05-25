package com.brandjunhoe.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.brandjunhoe.local.BaseDao
import com.brandjunhoe.local.model.ReposEntity

@Dao
interface ReposDao : BaseDao<ReposEntity> {

    @Query("SELECT * FROM ReposEntity WHERE id = :id")
    override fun select(id: String): ReposEntity


}