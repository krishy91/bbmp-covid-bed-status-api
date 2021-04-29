package com.krishna.controller

import com.krishna.model.HospitalBedStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hospital")
class HospitalController {

    @GetMapping("getAllBedStatus")
    fun getAllHospitalBedStatus(): List<HospitalBedStatus> {
        return emptyList()
    }

    @GetMapping("getBedStatus")
    fun getHospitalBedStatus(hospitalName: String): HospitalBedStatus? {
        return null
    }
}