package com.example.tp_foyer.service;

import com.example.tp_foyer.entity.Foyer;
import com.example.tp_foyer.entity.Reservation;

import java.util.List;

public interface IReservationimpl {


    List<Reservation> retrieveAllReservation();

    Reservation addReservation(Reservation res);

    Reservation updateReservation(Reservation res);

    Reservation retrieveReservation(long idReservation);

    void removeReservation(long idReservation);
}
