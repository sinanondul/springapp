package com.digitalplanet.store.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "maker")
    private String maker;

    @Column(name = "production_year")
    private LocalDate productionYear;

    @Column(name = "model")
    private String model;
}
