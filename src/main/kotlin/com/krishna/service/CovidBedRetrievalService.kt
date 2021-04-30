package com.krishna.service

import com.krishna.model.HospitalBedStatus
import org.springframework.stereotype.Service

interface CovidBedRetrievalService {

    fun getAllHospitalCovidBedStatus(): List<HospitalBedStatus>

}