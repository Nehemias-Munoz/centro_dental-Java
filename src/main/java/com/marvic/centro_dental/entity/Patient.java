package com.marvic.centro_dental.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Patients")
public class Patient {
    @Id
    @Column(name = "patient_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column
    private String run;
    @Column
    private int age;
    @Column
    private String address;
    @Column
    private String phone;
    @Column
    private String email;

    //Relation Pat. - Appointments
    @OneToMany(mappedBy = "patient")
    List<Appointment> appointmentList;

}
