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
public class chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private Typechambre typec;

    @ManyToOne
    Bloc bloc;

   @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;


}