package com.evalsoft.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class loginusuario {
    @Id
    private int id;
    private String usuarioId;
    private String password;



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public loginusuario(String usuarioId, String password, int id) {
        super();
        this.usuarioId = usuarioId;
        this.password = password;
        this.id = id;
    }
    public loginusuario() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "loginusuario [usuarioId=" + usuarioId + ", password=" + password + ", id ="+id+"]";
    }


}
