package com.project.clinica_veterinaria.controller;

import com.project.clinica_veterinaria.dto.MascoDuenioDTO;
import com.project.clinica_veterinaria.model.Mascota;
import com.project.clinica_veterinaria.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MascotaController {

    @Autowired
    private IMascotaService mascoServ;

    @GetMapping("/mascotas/traer")
    public List<Mascota> traerMascotas() {
        return mascoServ.getMascotas();
    }

    @PostMapping("/mascotas/crear")
    public String savePersona(@RequestBody Mascota masco) {
        mascoServ.saveMascota(masco);
        return "La mascota fue creada correctamente";
    }

    @DeleteMapping("/mascotas/borrar/{id_mascota}")
    public String deleteMascota(@PathVariable Long id_mascota) {
        mascoServ.deleteMascota(id_mascota);
        return "La mascota fue borrada correctamente";
    }

    @PutMapping("/mascotas/editar")
    public String editMascota(@RequestBody Mascota masco) {

        mascoServ.editMascota(masco);
        return "La mascota fue editada correctamente";
    }

    @GetMapping("/mascotas/traer-caniches")
    public List<Mascota> traerCaniches() {
        return mascoServ.getCaniches();
    }

    @GetMapping ("mascotas/traer-duenios")
    public List<MascoDuenioDTO> traerMascoDuenios () {

        return mascoServ.getMascoDuenios();

    }


}
