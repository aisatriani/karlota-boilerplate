package com.tenilodev.karlota.endpoint.utils

import com.j256.ormlite.dao.Dao
import com.j256.ormlite.dao.DaoManager
import com.j256.ormlite.jdbc.JdbcConnectionSource
import com.tenilodev.karlota.endpoint.Config

/**
 * Created by azisa on 11/21/2017.
 */

fun Database.Companion.getInstance() : JdbcConnectionSource {
    val url = "jdbc:${Config.db_driver}://${Config.db_host}/${Config.db_name}"
    return JdbcConnectionSource(url,Config.db_user,Config.db_password)
}

fun <T : Any?> createDao(clazz: Class<T>) : Dao<T, Long> {
    return DaoManager.createDao(Database.getInstance(),clazz)
}