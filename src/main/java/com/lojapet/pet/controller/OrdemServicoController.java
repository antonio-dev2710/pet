package com.lojapet.pet.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lojapet.pet.model.OrdemServico;
import com.lojapet.pet.services.IOrdemServico;

@RestController
public class OrdemServicoController {
    
    @Autowired
    private IOrdemServico service;

    @GetMapping("/servico")
	public ArrayList<OrdemServico> recuperarTodos() {

		return service.buscartodos();
	}

    @GetMapping("/servico/{idordemservico}")
	public ResponseEntity<OrdemServico>RecuperarPeloId(@PathVariable Integer idordemservico){
		OrdemServico res = service.buscarPeloId(idordemservico);
		if(res!=null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.status(404).build();
    }
}
