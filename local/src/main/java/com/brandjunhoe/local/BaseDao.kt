package com.brandjunhoe.local

import androidx.paging.DataSource
import androidx.room.*
import io.reactivex.Completable

interface BaseDao<D> {

    fun select(id:String):D

    //fun selectAllPaged(): DataSource.Factory<Int, D>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(data: D): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertList(dataList: List<D>) : Completable

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(data: D)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateList(dataList: List<D>)

    @Delete
    fun delete(data: D)

    @Delete
    fun deleteList(dataList: List<D>)


}