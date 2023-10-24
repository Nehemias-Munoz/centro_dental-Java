package com.marvic.centro_dental.repository;

import com.marvic.centro_dental.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepository extends JpaRepository<Appointment,Integer> {
}
