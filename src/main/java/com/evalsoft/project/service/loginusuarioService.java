package com.evalsoft.project.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface loginusuarioService {

    public int loginValidationn(String usuarioId, String password);
}
