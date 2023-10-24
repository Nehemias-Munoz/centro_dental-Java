package com.marvic.centro_dental.repository;

import com.marvic.centro_dental.entity.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISpecialtyRepository extends JpaRepository<Specialty,Integer> {
}
