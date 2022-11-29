package com.sample.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Vehicle {

    @Id
    private Integer vehicleid;
    private String vname;
    private String vmake;
    private String vengine;
    private String vetype;
    private String vprice;
    private String vcolor;
    private String vgear;
}
