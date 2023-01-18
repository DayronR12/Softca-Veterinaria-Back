package com.evalsoft.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "paciente")
public class Paciente {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;
        @Column(name = "nombre")
        private String nombre;
        @Column(name = "especie")
        private String especie;
        @Column(name = "raza")
        private String raza;

        public Paciente() {

        }

        public Paciente(String nombre, String especie, String raza) {
            this.nombre = nombre;
            this.especie = especie;
            this.raza = raza;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEspecie() {
            return especie;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }
    }


