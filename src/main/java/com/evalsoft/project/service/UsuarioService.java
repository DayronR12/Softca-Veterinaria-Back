package com.evalsoft.project.service;

import com.evalsoft.project.entity.Usuario;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public interface UsuarioService {
    public List<Usuario> findAll();
    public Usuario save(Usuario usuari);
    public Usuario findById(Integer Id);
    public void delete(Integer Id);
}