package com.example.tp_foyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "foyer")
    private Universite universite;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "foyer")
    private Set<Bloc> blocs;

}