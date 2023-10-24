package com.marvic.centro_dental.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Specialties")
public class Specialty {
    @Id
    @Column(name = "specialty_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int specialtyId;
    @Column
    private String name;

    //Relation Spe. - Dentist
    @OneToMany(mappedBy = "specialty")
    private List<Dentist> dentistList;
}
