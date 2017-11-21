package com.tenilodev.karlota.endpoint


import com.google.gson.Gson
import spark.kotlin.*
import com.j256.ormlite.dao.DaoManager
import com.j256.ormlite.dao.Dao
import com.j256.ormlite.jdbc.JdbcConnectionSource
import com.j256.ormlite.support.ConnectionSource
import com.tenilodev.karlota.endpoint.model.Buku
import com.google.gson.GsonBuilder
import com.tenilodev.karlota.endpoint.utils.Database


/**
 * Created by azisa on 11/21/2017.
 */
object KarlotaEndpoint {

    @JvmStatic fun main(args: Array<String>) {
        val http = ignite()
        Routes().initRoute(http)
    }

}
