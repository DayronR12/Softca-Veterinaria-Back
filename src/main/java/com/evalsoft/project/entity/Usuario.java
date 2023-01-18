package com.evalsoft.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tipo_identi")
    private String tipo_identi;
    @Column(name = "identificacion")
    private int identificacion;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private int telefono;

    public Usuario() {
    }

    public Usuario(String nombre, String tipo_identi, int identificacion, String ciudad, String direccion, int telefono) {
        this.nombre = nombre;
        this.tipo_identi = tipo_identi;
        this.identificacion = identificacion;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_identi() {
        return tipo_identi;
    }

    public void setTipo_identi(String tipo_identi) {
        this.tipo_identi = tipo_identi;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
