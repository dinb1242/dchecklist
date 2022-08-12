package com.dchecklist

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DchecklistApplication

fun main(args: Array<String>) {
    runApplication<DchecklistApplication>(*args)
}
