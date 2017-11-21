package com.tenilodev.karlota.endpoint

import com.google.gson.GsonBuilder
import com.tenilodev.karlota.endpoint.core.BaseRoute
import com.tenilodev.karlota.endpoint.model.Buku
import com.tenilodev.karlota.endpoint.utils.createDao
import spark.kotlin.Http

/**
 * Created by azisa on 11/21/2017.
 */
class Routes : BaseRoute() {
    override fun initRoute(http: Http) {
        http.get("/"){"karlota endpoint build on sparkjava"}
        http.get("/buku"){
            //sample of buku database
            val gson = GsonBuilder().setPrettyPrinting().create()
            val bukuDao = createDao(Buku::class.java)
            val all = bukuDao.queryForAll()
            val json = gson.toJson(all)
            "${json}"
        }
    }
}