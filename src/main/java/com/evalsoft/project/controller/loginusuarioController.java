package com.evalsoft.project.controller;

import com.evalsoft.project.service.loginusuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class loginusuarioController {

    @Autowired
    private loginusuarioService loginusuarioservice;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("loginusuario/{usuarioId}/{password}")

    public int loginusuarioLogin(@PathVariable("usuarioId") String usuarioId, @PathVariable("password") String password) {
        int flag = loginusuarioservice.loginValidationn(usuarioId, password);

        if (flag == 0) {
            return 0;
        }
        return flag;
    }
}
