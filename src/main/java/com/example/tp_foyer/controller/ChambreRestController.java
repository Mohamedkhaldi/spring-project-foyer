package com.example.tp_foyer.controller;

import com.example.tp_foyer.entity.chambre;
import com.example.tp_foyer.service.IchambreServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Tag(name = "Gestion Chambre")
@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {
    IchambreServiceImpl chambreService;


    // http://localhost:8080/foyer/chambre/retrieve-all-chambres
    @Operation(description = "récupérer tous les chambres de la base de données")
    @GetMapping("/retrieve-all-chambres")
    public List<chambre> getChambres() {
        List<chambre> listChambres = chambreService.retreiveAllChambre();
        return listChambres;
    }

    // http://localhost:8080/foyer/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public chambre retrieveChambre(@PathVariable("chambre-id") Long chId) {
        chambre chambre = chambreService.retreiveChambre(chId);
        return chambre;
    }

    // http://localhost:8080/foyer/chambre/add-chambre
    @PostMapping("/add-chambre")
    public chambre addChambre(@RequestBody chambre c) {
        chambre chambre = chambreService.addChambre(c);
        return chambre;
    }

    // http://localhost:8080/foyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.removeChambre(chId);
    }

    // http://localhost:8080/foyer/chambre/modify-chambre
    @PutMapping("/modify-chambre")
    public chambre modifyChambre(@RequestBody chambre c) {
        chambre chambre = chambreService.modify(c); return chambre;
    }

}
