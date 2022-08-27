package com.lojapet.pet.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lojapet.pet.model.Animal;
import com.lojapet.pet.services.IAnimal;

@RestController
public class AnimalController {
    @Autowired
    private IAnimal service;

    @GetMapping("/animal")
	public ArrayList<Animal> recuperarTodos() {

		return service.buscartodos();
	}

    @GetMapping("/animal/{idanimal}")
	public ResponseEntity<Animal>RecuperarPeloId(@PathVariable Integer idanimal){
		Animal res = service.buscarPeloId(idanimal);
		if(res!=null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.status(404).build();
    }

    @PostMapping("/animal")
	public ResponseEntity<Animal>CadastrarNovo(@RequestBody Animal novo){
		Animal res = service.criarDados(novo);
		if(res!=null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/endereco/{cliente_idcliente}")
	public ResponseEntity<Animal> excluirCliente(@PathVariable Integer cliente_idcliente) {

		service.excluirCliente(cliente_idcliente);
		return ResponseEntity.ok(null);

	}
}
