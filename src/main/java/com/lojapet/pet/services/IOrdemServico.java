package com.lojapet.pet.services;

import java.util.ArrayList;

import com.lojapet.pet.model.OrdemServico;

public interface IOrdemServico {
    public ArrayList<OrdemServico> buscartodos();
	
	public OrdemServico buscarPeloId(Integer idordem_servico);
    
}
