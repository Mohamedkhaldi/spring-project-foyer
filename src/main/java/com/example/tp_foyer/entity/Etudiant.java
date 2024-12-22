package com.example.tp_foyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;

    // Utilisation de LocalDate pour la date de naissance
    private LocalDate datedeNaissance;

    @ManyToMany(mappedBy = "etudiants",cascade = CascadeType.ALL)
    private Set<Reservation> Reservations;

}

