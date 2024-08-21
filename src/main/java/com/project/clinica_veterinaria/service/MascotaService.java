package com.project.clinica_veterinaria.service;

import com.project.clinica_veterinaria.dto.MascoDuenioDTO;
import com.project.clinica_veterinaria.model.Mascota;
import com.project.clinica_veterinaria.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    private IMascotaRepository mascotaRepository;

    @Override
    public List<Mascota> getMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);

    }

    @Override
    public void deleteMascota(Long id_mascota) {
        mascotaRepository.deleteById(id_mascota);

    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        return mascotaRepository.findById(id_mascota).orElse(null);
    }

    @Override
    public void editMascota(Mascota mascota) {

    }

    @Override
    public List<Mascota> getCaniches() {
        List<Mascota> listaMascotas = this.getMascotas();
        List<Mascota> listaCaniches = new ArrayList<Mascota>();

        for (Mascota masco:listaMascotas) {
            if (masco.getEspecie().equalsIgnoreCase("perro") && masco.getRaza().equalsIgnoreCase("caniche")) {
                listaCaniches.add(masco);
            }
        }
        return listaCaniches;
    }

    @Override
    public List<MascoDuenioDTO> getMascoDuenios() {
        List<Mascota> listaMarcotas = this.getMascotas();
        List<MascoDuenioDTO> listaMascotaDuenio = new ArrayList<MascoDuenioDTO>();
        MascoDuenioDTO mascoDuenioDTO = new MascoDuenioDTO();

        for (Mascota mascota : listaMarcotas) {
            System.out.println(mascota.getNombre());
            mascoDuenioDTO.setNombre_duenio(mascota.getDuenio().getNombre());
            mascoDuenioDTO.setApellido_duenio(mascota.getDuenio().getApellido());
            mascoDuenioDTO.setNombre_mascota(mascota.getNombre());
            mascoDuenioDTO.setEspecie(mascota.getEspecie());
            mascoDuenioDTO.setRaza(mascota.getRaza());
            listaMascotaDuenio.add(mascoDuenioDTO);
            mascoDuenioDTO = new MascoDuenioDTO();
        }
        return listaMascotaDuenio;
    }
}
