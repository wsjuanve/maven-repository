package com.github.wsjuanve.util

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class ThreadMe {

    fun test() {
        println("Coroutines start")
        runBlocking {
            println("runBlocking start ${Thread.currentThread().name}")
            Thread.sleep(2000)
            println("runBlocking end ${Thread.currentThread().name}")
        }

        GlobalScope.launch {

        }
        println("Coroutines End")
    }

}