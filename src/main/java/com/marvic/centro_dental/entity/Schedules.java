package com.marvic.centro_dental.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Data
@Entity
@Table
public class Schedules {
    @Id
    @Column(name = "schedule_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int scheduleId;
    //Relation Sch. - Dentists
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "dentist_id", nullable = false)
    private Dentists dentist;

    @Column(name = "day_of_week")
    private int dayOfWeek;
    @Column(name = "start_time")
    private LocalTime startTime;
    @Column(name = "end_time")
    private LocalTime endTime;
}
