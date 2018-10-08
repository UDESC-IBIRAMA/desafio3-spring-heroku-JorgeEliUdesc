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
@RequestMapping("/produto")
public class ProdutoResources {
    
    @Autowired
    private ProdutoRepositorio produtos;
    
    @GetMapping("/{id}")
    public Produto buscar(@PathVariable Long id){
        Optional<Produto> prod = produtos.findById(id);
        return prod.get();
    }
    
    @GetMapping
    public List<Produto> pesquisar(){
        return produtos.findAll();
    }
    
    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        return produtos.save(produto);
    }
    
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        //produtos.delete(id);
    }
}
