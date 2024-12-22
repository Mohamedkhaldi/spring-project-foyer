package com.example.tp_foyer.service;

import com.example.tp_foyer.entity.Foyer;
import com.example.tp_foyer.repositry.FoyerRepositry;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoyerServiceImpl implements  IFoyerService{
    FoyerRepositry foyerRepositry;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepositry.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
       return  foyerRepositry.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepositry.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer)
    {
        return foyerRepositry.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepositry.deleteById(idFoyer);

    }
}
