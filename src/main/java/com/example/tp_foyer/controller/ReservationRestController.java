package com.example.tp_foyer.controller;

import com.example.tp_foyer.entity.Reservation;
import com.example.tp_foyer.service.IReservationimpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Gestion Reservation")
@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {
    IReservationimpl reservationService;
    @Operation(description = "Récupérer la liste des reservations")
    @GetMapping("/retrieve-all-reservation")
    public List<Reservation> getChambres() {
        List<Reservation> listreservations = reservationService.retrieveAllReservation();
        return listreservations;
    }
    @Operation(description = "Modifier une reservation")
    @PutMapping("/modify-reservation")
    public Reservation modifierreservation (@RequestBody Reservation r){
        Reservation reservation = reservationService.updateReservation(r);
        return reservation;
    }
    @Operation(description = "Récupérer une reservation selon son id")
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation (@PathVariable("reservation-id") String id ){
        Reservation reservation = reservationService.retrieveReservation(Long.parseLong(id));
        return  reservation;
    }
}