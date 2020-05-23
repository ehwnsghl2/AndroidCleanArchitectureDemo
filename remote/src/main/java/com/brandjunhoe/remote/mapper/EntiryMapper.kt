package com.brandjunhoe.remote.mapper

interface EntiryMapper<in M, out E> {

    fun mapFromRemote(type: M): E

}
