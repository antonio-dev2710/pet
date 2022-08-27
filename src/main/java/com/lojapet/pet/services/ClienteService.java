package com.lojapet.pet.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojapet.pet.model.Cliente;
import com.lojapet.pet.repository.ClienteRepository;

@Service
public class ClienteService implements ICliente {

    @Autowired // ingeção direto no banco
    ClienteRepository repository;

    int validtelefone = 13;

    @Override
    public Cliente criarDados(Cliente novo) {

        if ((novo.getTelefone().length() >= 13 
            && novo.getTelefone().length() <= 14) 
            && novo.getTelefone().contains(")")
            && novo.getTelefone().contains("(") 
            && novo.getTelefone().contains("-")) {
            return repository.save(novo);
        }
        System.out.println("não ta funcionando");
        return null;
    }

    @Override
    public ArrayList<Cliente> buscartodos() {
        // TODO Auto-generated method stub
        return (ArrayList<Cliente>) repository.findAll();
    }

    @Override
    public Cliente buscarPeloId(Integer idcliente) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void excluirCliente(Integer idcliente) {
        // TODO Auto-generated method stub

    }

    @Override
    public Cliente atualizarDados(Cliente novo) {
        if (novo.getIdcliente()!= null && (novo.getNome()!= null
        && novo.getTelefone().length() >= 13 
        && novo.getTelefone().length() <= 14 
        && novo.getTelefone().contains(")")
        && novo.getTelefone().contains("(" )
        && novo.getTelefone().contains("-"))){
			
			return repository.save(novo);

		}
		return null;

    }

}
