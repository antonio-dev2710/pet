package com.lojapet.pet.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lojapet.pet.model.Cliente;
import com.lojapet.pet.services.ICliente;

@RestController
public class ClienteController {

	/***
	 * No controller será criada as classes que tem os métodos que será permitido
	 * relizar o crud sendo assim aplicado os endpoints /
	 */
	@Autowired // faço a ingeção de depencias
	// vai pegar a definição de uma classe e gerar todos os sqls
	private ICliente service;

	@GetMapping("/cliente")
	public ArrayList<Cliente> recuperarTodos() {

		return service.buscartodos();
	}

    @PostMapping("/cliente") // necessário essa validação para @email e @enpity funcionar
	public ResponseEntity<Cliente> incluirNovo( @RequestBody Cliente novo) {
		Cliente res = service.criarDados(novo);
		// resquest ta voltando 200
		// o objeto responseEntity me da uma resposta http
		if (res == null) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(res);
    }
    @PutMapping("/cliente")
	public ResponseEntity<Cliente> alterar(@RequestBody Cliente dados) {

		Cliente res = service.atualizarDados(dados);

		if (res != null) {

			return ResponseEntity.ok(res);

		}

		return ResponseEntity.badRequest().build();

	}

    @GetMapping("/cliente/{idcliente}")
	public ResponseEntity<Cliente> encontrarPeloId(@PathVariable Integer idcliente) {

		Cliente res = service.buscarPeloId(idcliente);

		if (res != null) {

			return ResponseEntity.ok(res);

		}

		return ResponseEntity.badRequest().build();

	}
    @DeleteMapping("/cliente/{idcliente}")
	public ResponseEntity<Integer> excluirCliente(@PathVariable Integer idcliente) {

		service.excluirCliente(idcliente);
		return ResponseEntity.ok(idcliente);

	}

}