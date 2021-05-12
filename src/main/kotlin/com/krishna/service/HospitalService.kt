package com.krishna.service

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.krishna.model.Hospital
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class HospitalService {

    private val allHospitals: List<Hospital> = emptyList()

    @PostConstruct
    private fun loadAllHospitals(){
        val mapper = JsonMapper.builder().addModule(KotlinModule()).build()
        TODO("Load data from json & add to variable")
    }

    fun getAllHospitals(): List<Hospital> = allHospitals

    fun getHospitalByName(name: String): Hospital? {
        TODO("Not yet implemented")
    }

}