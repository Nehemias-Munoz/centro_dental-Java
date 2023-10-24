package com.marvic.centro_dental.repository;

import com.marvic.centro_dental.entity.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDentistRepository extends JpaRepository<Dentist,Integer> {
}
