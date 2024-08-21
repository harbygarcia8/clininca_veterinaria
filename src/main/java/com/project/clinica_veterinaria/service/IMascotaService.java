package com.project.clinica_veterinaria.service;

import com.project.clinica_veterinaria.dto.MascoDuenioDTO;
import com.project.clinica_veterinaria.model.Mascota;

import java.util.List;

public interface IMascotaService {

    List<Mascota> getMascotas();
    void saveMascota(Mascota mascota);
    void deleteMascota(Long id_mascota);
    Mascota findMascota(Long id_mascota);
    void editMascota(Mascota mascota);
    List<Mascota> getCaniches();
    List<MascoDuenioDTO> getMascoDuenios();

}
