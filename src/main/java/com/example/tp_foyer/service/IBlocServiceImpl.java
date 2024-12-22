package com.example.tp_foyer.service;

import com.example.tp_foyer.entity.Bloc;

import java.util.List;

public interface IBlocServiceImpl {
    List<Bloc> retrieveBlocs();

    Bloc retrieveBloc(Long id);

    Bloc addBloc(Bloc b);

    void removeBloc(Long id);

    Bloc updateBloc(Bloc b);
}
