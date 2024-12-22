package com.example.tp_foyer.controller;
// UniversiteRestController


import com.example.tp_foyer.entity.Universite;
import com.example.tp_foyer.service.IUniversiteServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Tag(name="Gestion Universite")
@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {
    IUniversiteServiceImpl universiteService;
    @Operation(description = "Récupérer la liste des universités")
    @GetMapping("/retrieve-all-universite")
    public List<Universite> getChambres() {
        List<Universite> listuniversites = universiteService.retrieveAllUniversities();
        return listuniversites;
    }
    @Operation(description = "Récupérer une université selon son id")
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite (@PathVariable("universite-id") Long id ){
        Universite universite = universiteService.retrieveUniversite(id);
        return  universite;
    }
    @Operation(description = "Ajouter une université a la base des données")
    @PostMapping("/add-universite")
    public Universite adduniversite(@RequestBody Universite u){
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }
    @Operation(description = "Modifier une université selon son id")
    @PutMapping("/modify-universite")
    public Universite modifieruniversite (@RequestBody Universite u){
        Universite universite=universiteService.updateUniversite(u);
        return universite;
    }

}
