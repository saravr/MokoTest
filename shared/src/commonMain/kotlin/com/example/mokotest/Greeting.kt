package com.example.mokotest

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        //val string = getMyString().toString(context = this)

        return "Hello, ${platform.name}!"
    }
}