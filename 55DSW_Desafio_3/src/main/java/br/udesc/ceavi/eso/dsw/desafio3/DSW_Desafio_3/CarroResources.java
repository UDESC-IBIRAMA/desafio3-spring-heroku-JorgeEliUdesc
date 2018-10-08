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
@RequestMapping("/carro")
public class CarroResources {
    @Autowired
    private CarroRepositorio carros;
    
    @GetMapping("/{id}")
    public Carro buscar(@PathVariable Long id){
        Optional<Carro> car = carros.findById(id);
        return car.get();
    }
    
    @GetMapping
    public List<Carro> pesquisar(){
        return carros.findAll();
    }
    
    @PostMapping
    public Carro salvar(@RequestBody Carro carro){
        return carros.save(carro);
    }
    
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        //carros.delete(id);
    }    
}
