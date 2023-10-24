package com.marvic.centro_dental.restcontroller;

import com.marvic.centro_dental.entity.Specialty;
import com.marvic.centro_dental.services.ISpecialtyService;
import com.marvic.centro_dental.services.serviceImplement.SpecialtyImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/specialty")
public class SpecialtyRestController{

    @Autowired
    SpecialtyImplement specialtyImplement;
    @GetMapping
    public List<Specialty> getSpecialtyList() {
        return specialtyImplement.getSpecialtyList();
    }
    @PostMapping("/create/")
    public Specialty createSpecialty(@RequestBody Specialty newSpecialty) {
        return specialtyImplement.createSpecialty(newSpecialty);
    }

    @GetMapping("/get/{id}")
    public Specialty findSpecialtyById(@PathVariable int id) {
        return specialtyImplement.findSpecialtyById(id);
    }

    @PutMapping("/update/")
    public Specialty updateSpecialty(@RequestBody Specialty newDataSpecialty) {
        return specialtyImplement.updateSpecialty(newDataSpecialty);
    }

    @DeleteMapping("/delete/")
    public void deleteSpecialty(@RequestBody Specialty specialtyToDelete) {
        specialtyImplement.deleteSpecialty(specialtyToDelete);
    }
}
