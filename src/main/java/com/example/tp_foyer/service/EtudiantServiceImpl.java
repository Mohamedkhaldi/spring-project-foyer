package com.example.tp_foyer.service;

import com.example.tp_foyer.entity.Etudiant;
import com.example.tp_foyer.repositry.EtudiantRepositry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceImpl implements IEtudiantServiceImpl {
EtudiantRepositry etudiantRepositry;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepositry.findAll();
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return etudiantRepositry.saveAll(etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepositry.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return etudiantRepositry.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(long idEtudiant) {
        etudiantRepositry.deleteById(idEtudiant);

    }
}
