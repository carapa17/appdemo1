/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.appdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carlos Parra
 */
@RestController
@RequestMapping("/saludo")
public class holaController {
    @GetMapping("/hola")
    public String saludo(){
        return "<h1>Saludo</h1><p>Que más de cosas";
    }
    
}
