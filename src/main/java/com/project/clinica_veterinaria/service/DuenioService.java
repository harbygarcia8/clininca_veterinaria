package com.project.clinica_veterinaria.service;

import com.project.clinica_veterinaria.model.Duenio;
import com.project.clinica_veterinaria.repository.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenioService implements IDuenioService {
    @Autowired
    private IDuenioRepository duenioRepository;

    @Override
    public List<Duenio> getDuenios() {
        return duenioRepository.findAll();
    }

    @Override
    public void saveDuenio(Duenio duenio) {
        duenioRepository.save(duenio);
    }

    @Override
    public void deleteDuenio(Long id) {
        duenioRepository.deleteById(id);
    }

    @Override
    public Duenio findDuenio(Long id) {
        return duenioRepository.findById(id).orElse(null);
    }

    @Override
    public void editDuenio(Duenio duenio) {
        this.saveDuenio(duenio);
    }
}
