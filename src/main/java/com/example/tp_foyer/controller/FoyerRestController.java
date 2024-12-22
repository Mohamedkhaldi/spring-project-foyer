package com.example.tp_foyer.controller;

import com.example.tp_foyer.entity.Foyer;
import com.example.tp_foyer.service.IFoyerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Tag(name = "Gestion Foyer")
@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController{
    IFoyerService FoyerService;

    @Operation(description = "récupérer tous les Foyers de la base de données")
    @GetMapping("/retrieve-all-foyer")
    public List<Foyer> getFoyers() {
        List<Foyer> listFoyers = FoyerService.retrieveAllFoyers();
        return listFoyers;
    }


    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long chId) {
        Foyer Foyer= FoyerService.retrieveFoyer(chId);
        return Foyer;
    }


    @PostMapping("/add-chambre")
    public Foyer addFoyer(@RequestBody Foyer F) {
        Foyer Foyer = FoyerService.addFoyer(F);
        return Foyer;
    }


    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long chId) {
        FoyerService.removeFoyer(chId);
    }


    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer F) {
        Foyer Foyer = FoyerService.updateFoyer(F);
        return Foyer;
    }

}
