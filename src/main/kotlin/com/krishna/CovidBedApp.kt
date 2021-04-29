package com.krishna

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CovidBedApp {

    fun main(args: Array<String>) {
        runApplication<CovidBedApp>(*args)
    }

}