/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.eso.dsw.desafio3.DSW_Desafio_3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jorge
 */
@RestController
@RequestMapping("/moto")
public class MotoResouces {
    @Autowired
    private MotoRepositorio motos;
    
    @GetMapping("/{id}")
    public Moto buscar(@PathVariable Long id){
        Optional<Moto> mot = motos.findById(id);
        return mot.get();
    }
    
    @GetMapping
    public List<Moto> pesquisar(){
        return motos.findAll();
    }
    
    @PostMapping
    public Moto salvar(@RequestBody Moto moto){
        return motos.save(moto);
    }
    
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        //motos.delete(id);
    }     
}
