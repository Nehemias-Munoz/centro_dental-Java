package com.marvic.centro_dental.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table
public class Appointments {
    @Id
    @Column(name = "appointment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointmentId;

    //Relation App. - Patient
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patients patient;

    //Relation App. - Dentist
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "dentist_id", nullable = false)
    private Dentists dentist;

    @Column
    private LocalDate date;
    @Column
    private LocalTime time;
    @Column
    private String comment;
    @Column
    private AppointmentStatus status;
}
