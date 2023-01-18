package com.evalsoft.project.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.evalsoft.project.DBUtil.DBUtil;
import org.springframework.stereotype.Service;


@Service
public class loginusuarioServiceImpl implements loginusuarioService{

    Connection connection;
    int flag = 0;

    public loginusuarioServiceImpl() throws SQLException {
        connection = DBUtil.getConnection();
    }


    @Override
    public int loginValidationn(String usuarioId, String password) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM loginusuario WHERE usuarioId = '"+usuarioId+"'");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                if (rs.getString(1).equals(usuarioId) && rs.getString(2).equals(password)) {
                    flag = 1;
                }else {
                    System.out.println("Usuario/Contraseña invalidos");
                    flag = 0;
                }
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return flag;
    }



}