package com.lojapet.pet.services;

import java.util.ArrayList;

import com.lojapet.pet.model.Animal;

public interface IAnimal {
    public ArrayList<Animal> buscartodos();
	
	public Animal buscarPeloId(Integer IDcliente);

	public void excluirCliente(Integer IDendereco);
    public Animal criarDados(Animal dados);
}
