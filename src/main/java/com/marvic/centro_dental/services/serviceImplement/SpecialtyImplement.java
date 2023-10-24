package com.marvic.centro_dental.services.serviceImplement;

import com.marvic.centro_dental.entity.Specialty;
import com.marvic.centro_dental.repository.ISpecialtyRepository;
import com.marvic.centro_dental.services.ISpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class SpecialtyImplement implements ISpecialtyService {
    @Autowired
    ISpecialtyRepository iSpecialtyRepository;
    @Override
    public List<Specialty> getSpecialtyList() {
        return iSpecialtyRepository.findAll();
    }

    @Override
    public Specialty createSpecialty(Specialty newSpecialty) {
        return iSpecialtyRepository.save(newSpecialty);
    }

    @Override
    public Specialty findSpecialtyById(int id) {
        return iSpecialtyRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Registro no encontrado"));
    }

    @Override
    public Specialty updateSpecialty(Specialty newDataSpecialty) {
        return null;
//        return iSpecialtyRepository.save();
    }

    @Override
    public void deleteSpecialty(Specialty specialtyToDelete) {
        if(iSpecialtyRepository.existsById(specialtyToDelete.getSpecialtyId())){
            iSpecialtyRepository.delete(specialtyToDelete);
        }
    }
}
