package com.tenilodev.karlota.endpoint.core

import spark.kotlin.Http


/**
 * Created by azisa on 11/21/2017.
 */
abstract class BaseRoute {
    abstract fun initRoute(http : Http)
}