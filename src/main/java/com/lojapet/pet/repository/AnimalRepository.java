package com.lojapet.pet.repository;

import org.springframework.data.repository.CrudRepository;

import com.lojapet.pet.model.Animal;

public interface  AnimalRepository extends CrudRepository<Animal,Integer> {
    
    
}
