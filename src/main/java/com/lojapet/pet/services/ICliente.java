package com.lojapet.pet.services;

import java.util.ArrayList;

import com.lojapet.pet.model.Cliente;

public interface ICliente {

    // passar os dados para um novo cliente
    // e deve ser retornado se for criado ou n

    public Cliente criarDados(Cliente dados);

    public ArrayList<Cliente> buscartodos();

    public Cliente buscarPeloId(Integer idcliente);

    public void excluirCliente(Integer idcliente);

    public Cliente atualizarDados(Cliente novo);
   
	
}
