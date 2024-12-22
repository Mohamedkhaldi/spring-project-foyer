// BlocRestController
package com.example.tp_foyer.controller;

import com.example.tp_foyer.entity.Bloc;
import com.example.tp_foyer.service.IBlocServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Tag(name="Gestion Bloc")
@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {
    IBlocServiceImpl blocService;
    @Operation(description = "Récupérer la liste des blocs de la base des données")
    @GetMapping("/retrieve-all-bloc")
    public List<Bloc> getChambres() {
        List<Bloc> listblocs = blocService.retrieveBlocs();
        return listblocs;
    }
    @Operation(description = "Récupérer un bloc selon son id")
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBlocs (@PathVariable("bloc-id") Long id ){
        Bloc bloc = blocService.retrieveBloc(id);
        return  bloc;
    }
    @Operation(description = "Ajouter un bloc a la base des données")
    @PostMapping("/add-bloc")
    public Bloc addbloc(@RequestBody Bloc b){
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }
    @Operation(description = "Supprimer un bloc selon son id")
    @DeleteMapping("/remove-bloc/{id-bloc}")
    public void deletebloc(@PathVariable("id-bloc") Long id){
        blocService.removeBloc(id);
    }
    @Operation(description = "Modifier un bloc selon son id")
    @PutMapping("/modify-bloc")
    public Bloc modifierbloc (@RequestBody Bloc b){
        Bloc bloc=blocService.updateBloc(b);
        return bloc;
    }

}