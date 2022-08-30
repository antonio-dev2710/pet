package com.lojapet.pet.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.lojapet.pet.model.Cliente;

public interface ClienteRepository extends CrudRepository< Cliente,Integer>{
    public ArrayList<Cliente> findByNomeContaining(String palavraCahve);
	
}