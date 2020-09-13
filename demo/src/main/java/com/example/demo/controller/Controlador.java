package com.example.demo.controller;

import com.example.demo.Entidad.Persona;
import com.example.demo.Servicio.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class Controlador {
    @Autowired
    Servicio servicio;

    @GetMapping
    public List<Persona> getTodos(@PageableDefault(value = 10,page=0) Pageable pageable){
        List<Persona> lista;
        lista = servicio.devolverTodos(pageable);
        System.out.println("TEXTO");


        return lista;
    }
}
