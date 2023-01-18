package com.evalsoft.project.service;

import com.evalsoft.project.entity.Paciente;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public interface PacienteService {
    public List<Paciente> findAll();
    public Paciente save(Paciente paciente);
    public Paciente findById(Integer Id);
    public void delete(Integer Id);
}