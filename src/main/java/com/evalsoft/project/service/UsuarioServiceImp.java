package com.evalsoft.project.service;

import com.evalsoft.project.entity.Usuario;
import com.evalsoft.project.repository.UsuarioRepository;
import com.evalsoft.project.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImp implements UsuarioService{
    @Autowired(required = false)
    private UsuarioRepository usuarioRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll(){
        return (List<Usuario>) usuarioRepository.findAll();
    }
    @Override
    @Transactional(readOnly = false)
    public Usuario save(Usuario usuari){
        return usuarioRepository.save(usuari);
    }
    @Override
    @Transactional(readOnly = true)
    public Usuario findById(Integer id){
        return usuarioRepository.findById(id).orElse(null);
    }
    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id){
        usuarioRepository.deleteById(id);
    }
}