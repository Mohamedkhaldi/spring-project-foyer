package com.example.tp_foyer.repositry;

import com.example.tp_foyer.entity.Bloc;
import com.example.tp_foyer.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReservationRepositry  extends JpaRepository<Reservation,Long> {
}
