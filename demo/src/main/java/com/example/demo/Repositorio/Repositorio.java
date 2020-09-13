package com.example.demo.Repositorio;

import com.example.demo.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositorio extends JpaRepository<Persona,Integer> {

    //List<Persona> todos();
    List<Persona> findByIdIn(List<Persona> inventoryIdList);

}
