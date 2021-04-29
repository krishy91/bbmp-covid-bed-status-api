package com.krishna.model

data class HospitalBedStatus(val hospital: Hospital, val totalBeds: HospitalBedCount, val occupiedBeds: HospitalBedCount, val availableBeds: HospitalBedCount)
