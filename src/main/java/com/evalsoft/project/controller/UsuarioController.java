package com.evalsoft.project.controller;

import com.evalsoft.project.entity.Usuario;
import com.evalsoft.project.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired(required = false)

    private UsuarioService usuarioService;

    //listar
    @GetMapping("/usu")
    public List<Usuario> listar(){
        return usuarioService.findAll();
    }

    //guardar
    @PostMapping("/usu")
    public Usuario guardar(@RequestBody Usuario usuari){
        return usuarioService.save(usuari);
    }

    //buscar por id
    @GetMapping("/usu/{id}")
    public Usuario getUnPaciente(@PathVariable Integer id){
        return usuarioService.findById(id);
    }

    //modificar
    @PutMapping("/usu/{id}")
    public Usuario modificar(@RequestBody Usuario usuari, @PathVariable Integer id){

        Usuario usuarioActual = usuarioService.findById(id);
        usuarioActual.setNombre(usuari.getNombre());
        usuarioActual.setTipo_identi(usuari.getTipo_identi());
        usuarioActual.setIdentificacion(usuari.getIdentificacion());
        usuarioActual.setCiudad(usuari.getCiudad());
        usuarioActual.setDireccion(usuari.getDireccion());
        usuarioActual.setTelefono(usuari.getTelefono());

        return usuarioService.save(usuarioActual);
    }

    //borrar
    @DeleteMapping("/usu/{id}")
    public void eliminar(@PathVariable Integer id){
        usuarioService.delete(id);
    }
}
