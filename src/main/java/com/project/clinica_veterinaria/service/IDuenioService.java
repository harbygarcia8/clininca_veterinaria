package com.project.clinica_veterinaria.service;

import com.project.clinica_veterinaria.model.Duenio;

import java.util.List;

public interface IDuenioService {

    List<Duenio> getDuenios();
    void saveDuenio(Duenio duenio);
    void deleteDuenio(Long id);
    Duenio findDuenio(Long id);
    void editDuenio (Duenio duenio);

}
