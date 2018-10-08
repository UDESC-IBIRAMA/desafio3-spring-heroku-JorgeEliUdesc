package br.udesc.ceavi.eso.dsw.desafio3.DSW_Desafio_3;


import br.udesc.ceavi.eso.dsw.desafio3.DSW_Desafio_3.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{
    
}
