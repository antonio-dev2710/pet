package com.lojapet.pet.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojapet.pet.model.Animal;
import com.lojapet.pet.repository.AnimalRepository;
@Service
public class AnimalService implements IAnimal {

    @Autowired // ingeção direto no banco
	AnimalRepository repository;

    @Override
    public ArrayList<Animal> buscartodos() {
        return (ArrayList<Animal>) repository.findAll();
    }

    @Override
    public Animal buscarPeloId(Integer idcliente) {
        
        return repository.findById(idcliente).orElse(null);

        
    }

    @Override
    public void excluirCliente(Integer idcliente) {
        
        repository.deleteById(idcliente);
        
    }

    @Override
    public Animal criarDados(Animal dados) {
        return repository.save(dados);
    }

    
}
