package com.marvic.centro_dental.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Dentists")
public class Dentist {
    @Id
    @Column(name = "dentist_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dentistId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    // Relation Den. - Specialty
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "specialty_id", nullable = false)
    private Specialty specialty;

    @Column
    private String phone;
    @Column
    private String email;

    //Relation Den. - Appointment
    @OneToMany(mappedBy = "dentist")
    List<Appointment> appointmentList;

    //Relation Den. - Schedules
    @OneToMany(mappedBy = "dentist")
    List<Schedule> scheduleList;
}
