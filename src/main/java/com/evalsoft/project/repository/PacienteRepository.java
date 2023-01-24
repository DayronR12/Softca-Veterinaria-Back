package com.evalsoft.project.repository;

import com.evalsoft.project.entity.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Integer> {
}
