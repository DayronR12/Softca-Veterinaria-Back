package com.evalsoft.project.controller;

import com.evalsoft.project.entity.Paciente;
import com.evalsoft.project.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired(required = false)

    private PacienteService pacienteService;

    //listar
    @GetMapping("/pac")
    public List<Paciente> listar(){
        return pacienteService.findAll();
    }

    //guardar
    @PostMapping("/pac")
    public Paciente guardar(@RequestBody Paciente paciente){
        return pacienteService.save(paciente);
    }

    //buscar por id
    @GetMapping("/pac/{id}")
    public Paciente getUnPaciente(@PathVariable Integer id){
        return pacienteService.findById(id);
    }

    //modificar
    @PutMapping("/pac/{id}")
    public Paciente modificar(@RequestBody Paciente paciente, @PathVariable Integer id){

        Paciente pacienteActual = pacienteService.findById(id);

        pacienteActual.setNombre(paciente.getNombre());
        pacienteActual.setEspecie(paciente.getEspecie());
        pacienteActual.setRaza(paciente.getRaza());

        return pacienteService.save(pacienteActual);
    }

    //borrar
    @DeleteMapping("/pac/{id}")
    public void eliminar(@PathVariable Integer id){
        pacienteService.delete(id);
    }
}
