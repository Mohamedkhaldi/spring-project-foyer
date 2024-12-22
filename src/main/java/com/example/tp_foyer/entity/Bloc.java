package com.example.tp_foyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;

    @ManyToOne
    Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "bloc")
    private Set<chambre> chambres;
}