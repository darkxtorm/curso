package com.roman.servingwebmysql.controllers;

import com.roman.servingwebmysql.utility.UrlContstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UrlContstants.CLIENTE)
public class ClienteController {

    @GetMapping("")
    public String goCliente(){
        return "cliente";
    }
}
