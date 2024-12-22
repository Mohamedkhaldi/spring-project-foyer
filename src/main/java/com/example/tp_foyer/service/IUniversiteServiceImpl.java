package com.example.tp_foyer.service;

import com.example.tp_foyer.entity.Universite;

import java.util.List;

public interface IUniversiteServiceImpl {
    Universite addUniversite(Universite u);

    Universite retrieveUniversite(Long id);

    List<Universite> retrieveAllUniversities();

    Universite updateUniversite(Universite u);
}
