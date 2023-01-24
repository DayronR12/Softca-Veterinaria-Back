package com.evalsoft.project.service;

import com.evalsoft.project.entity.Paciente;
import com.evalsoft.project.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PacienteServiceImp implements PacienteService{
    @Autowired(required = false)
    private PacienteRepository pacienteRepository;
    @Override
    @Transactional(readOnly = true)
    public List<Paciente> findAll(){
        
        return (List<Paciente>) pacienteRepository.findAll();
    }
    @Override
    @Transactional(readOnly = false)
    public Paciente save(Paciente paciente){
        return pacienteRepository.save(paciente);
    }
    @Override
    @Transactional(readOnly = true)
    public Paciente findById(Integer id){
        return pacienteRepository.findById(id).orElse(null);
    }
    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id){
        pacienteRepository.deleteById(id);
    }
}
