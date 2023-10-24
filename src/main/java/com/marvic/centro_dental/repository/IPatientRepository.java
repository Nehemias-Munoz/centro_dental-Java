package com.marvic.centro_dental.repository;

import com.marvic.centro_dental.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepository extends JpaRepository<Patient,Integer> {
}
