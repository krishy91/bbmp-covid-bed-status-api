package com.krishna.controller

import com.krishna.model.HospitalBedStatus
import com.krishna.service.CovidBedRetrievalService
import com.krishna.service.MockCovidBedRetrievalService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hospital")
class HospitalController(@Autowired val covidBedRetrievalService: CovidBedRetrievalService) {

    @GetMapping("getAllBedStatus")
    fun getAllHospitalBedStatus(): List<HospitalBedStatus> {
        return covidBedRetrievalService.getAllHospitalCovidBedStatus()
    }

    @GetMapping("getBedStatus")
    fun getHospitalBedStatus(hospitalName: String): HospitalBedStatus? {
        return null
    }
}