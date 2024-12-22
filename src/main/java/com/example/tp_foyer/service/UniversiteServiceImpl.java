package com.example.tp_foyer.service;

import com.example.tp_foyer.entity.Universite;
import com.example.tp_foyer.entity.Reservation;

import java.util.List;

import com.example.tp_foyer.repositry.UniversiteRepository;
import org.springframework.stereotype.Service;

@Service
public class UniversiteServiceImpl implements  IUniversiteServiceImpl{

    @Override
    public Universite addUniversite(Universite u) {
        return null;
    }

    @Override
    public Universite retrieveUniversite(Long id) {
        return null;
    }

    @Override
    public List<Universite> retrieveAllUniversities() {
        return List.of();
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return null;
    }
}
