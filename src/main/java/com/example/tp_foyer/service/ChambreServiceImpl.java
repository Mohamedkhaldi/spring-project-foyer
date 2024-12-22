package com.example.tp_foyer.service;

import com.example.tp_foyer.entity.chambre;
import com.example.tp_foyer.repositry.ChambreRepositry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IchambreServiceImpl{
    ChambreRepositry ChambreRepositry;
    @Override
    public List<chambre> retreiveAllChambre() {
        return ChambreRepositry.findAll();
    }

    @Override
    public chambre retreiveChambre(Long chambreid) {
        return ChambreRepositry.findById(chambreid).get();
    }

    @Override
    public chambre addChambre(chambre c) {

        return ChambreRepositry.save(c) ;
    }

    public void removeChambre(Long chambreid) {
        ChambreRepositry.deleteById(chambreid);

    }

    @Override
    public chambre modify(chambre chambre) {
        return ChambreRepositry.save(chambre);
    }
}
