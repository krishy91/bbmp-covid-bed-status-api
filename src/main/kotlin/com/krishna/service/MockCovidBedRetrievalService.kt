package com.krishna.service

import com.krishna.model.Hospital
import com.krishna.model.HospitalBedCount
import com.krishna.model.HospitalBedStatus
import com.krishna.model.HospitalType
import org.springframework.stereotype.Service

@Service
class MockCovidBedRetrievalService: CovidBedRetrievalService  {

    override fun getAllHospitalCovidBedStatus(): List<HospitalBedStatus> {
        val h1: Hospital = Hospital("1", "Akash Hospital", HospitalType.PRIVATE_HOSPITAL, "Bangalore", 560001, 0.0f, 0.0f)
        val totalBeds1 = HospitalBedCount(330,270,10,22,632)
        val occupBeds1 = HospitalBedCount(268,262,10,22 ,562)
        val availBeds1 = HospitalBedCount(62,8,0,0,70)
        val hbs1: HospitalBedStatus = HospitalBedStatus(h1, totalBeds1, occupBeds1, availBeds1)

        val res: List<HospitalBedStatus> = mutableListOf<HospitalBedStatus>(hbs1)

        return res
    }

}