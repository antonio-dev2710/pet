package com.lojapet.pet.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojapet.pet.model.OrdemServico;
import com.lojapet.pet.repository.OrdemServicoRepository;


@Service
public class OrdemServicoService implements IOrdemServico {

    @Autowired // ingeção direto no banco
    OrdemServicoRepository repository;
    @Override
    public ArrayList<OrdemServico> buscartodos() {
        
        return (ArrayList<OrdemServico>) repository.findAll();
    }

    @Override
    public OrdemServico buscarPeloId(Integer idordem_servico) {
        
        return repository.findById(idordem_servico).orElse(null);
    }
    
}
