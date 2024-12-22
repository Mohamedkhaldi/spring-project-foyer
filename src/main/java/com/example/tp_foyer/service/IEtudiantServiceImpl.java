package com.example.tp_foyer.service;

import com.example.tp_foyer.entity.Etudiant;

import java.util.List;

public interface IEtudiantServiceImpl {
    List<Etudiant> retrieveAllEtudiants();
    List<Etudiant> addEtudiants (List<Etudiant> etudiants);
    Etudiant updateEtudiant (Etudiant e);
    Etudiant retrieveEtudiant(long idEtudiant);
    void removeEtudiant(long idEtudiant);

}
