package com.example.tp_foyer.controller;

import com.example.tp_foyer.entity.Etudiant;
import com.example.tp_foyer.entity.chambre;
import com.example.tp_foyer.service.IEtudiantServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Gestion Etudiant")
@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    IEtudiantServiceImpl etudiantService;

    @Operation(description = "Récupérer la liste des Etudiants de la base des données")
    @GetMapping("/retrieve-all-etudiant")
    public List<Etudiant> getChambres() {
        List<Etudiant> listetudiants = etudiantService.retrieveAllEtudiants();
        return listetudiants;
    }
    @Operation(description = "Récupérer la liste des etudiants de la base des données selon id ")
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiants (@PathVariable("etudiant-id") Long id ){
        Etudiant etudiant = etudiantService.retrieveEtudiant(id);
        return  etudiant;
    }
    @Operation(description = "Ajouter un etudiant a la base de donnée")
    @PostMapping("/add-etudiants")
    public List<Etudiant> addetudiants(List<Etudiant> e){
        List<Etudiant> listeEtudiants = etudiantService.addEtudiants(e);
        return listeEtudiants;
    }
    @Operation(description = "supprimer un etudiant de la base de donnée selon son id ")
    @DeleteMapping("/removeetudiant/{id-etudiant}")
    public void deleteetudiant(@PathVariable("id-etudiant") Long id){
        etudiantService.retrieveEtudiant(id);
    }
    @Operation(description = "modifier l etudiant selon son id ")
    @PutMapping("/modify-etudiant")
    public Etudiant modifieretudiant (Etudiant e){
        Etudiant etudiant=etudiantService.updateEtudiant(e);
        return etudiant;
    }



}
