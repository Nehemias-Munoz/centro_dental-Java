package com.marvic.centro_dental.services;

import com.marvic.centro_dental.entity.Specialty;

import java.util.List;

public interface ISpecialtyService {
    List<Specialty> getSpecialtyList();
    Specialty createSpecialty(Specialty newSpecialty);
    Specialty findSpecialtyById(int id);
    Specialty updateSpecialty(Specialty newDataSpecialty);
    void deleteSpecialty(Specialty specialtyToDelete);
}
