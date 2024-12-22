package com.example.tp_foyer.service;

import com.example.tp_foyer.entity.Reservation;
import com.example.tp_foyer.entity.Reservation;

import java.util.List;

import com.example.tp_foyer.repositry.ReservationRepositry;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements  IReservationimpl {
    ReservationRepositry reservationRepositry;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepositry.findAll();
    }

    @Override
    public Reservation addReservation(Reservation res) {

        return reservationRepositry.save(res);

    }

    @Override
    public Reservation updateReservation(Reservation res)
    {
        return reservationRepositry.save(res);
    }

    @Override
    public Reservation retrieveReservation(long idReservation) {

        return reservationRepositry.findById(idReservation).get();
    }


    @Override
    public void removeReservation(long idReservation) {

        reservationRepositry.deleteById(idReservation);
    }


}
