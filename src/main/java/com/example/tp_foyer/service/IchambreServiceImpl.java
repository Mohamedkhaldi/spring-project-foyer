package com.example.tp_foyer.service;

import com.example.tp_foyer.entity.chambre;

import java.util.List;

public interface IchambreServiceImpl {

    public List<chambre> retreiveAllChambre();
    public chambre retreiveChambre(Long chambreid);
    public chambre addChambre(chambre c);
    public void removeChambre(Long chambreid);
    public chambre modify(chambre chambre);

}
