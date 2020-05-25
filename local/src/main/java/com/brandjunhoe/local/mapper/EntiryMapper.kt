package com.brandjunhoe.local.mapper

interface EntiryMapper<M, E> {

    fun mapFromLocal(type: M): E
    fun mapToLocal(type: E): M

}

