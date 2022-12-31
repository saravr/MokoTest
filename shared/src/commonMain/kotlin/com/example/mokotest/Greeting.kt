package com.example.mokotest

import dev.icerock.moko.resources.desc.Resource
import dev.icerock.moko.resources.desc.StringDesc

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        //val string = getMyString().toString(context = this)

        return "Hello, ${platform.name}!"
    }

    fun getMyString(): StringDesc {
        return StringDesc.Resource(MR.strings.my_string)
    }
}