package com.lojapet.pet.repository;



import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.lojapet.pet.model.OrdemServico;

public interface OrdemServicoRepository  extends CrudRepository<OrdemServico,Integer>{
    
    //pode se colocar uma query costumizada
   public ArrayList<OrdemServico> findByOrderByValor();
    //pesquisa pelo amior valor
   //public ArrayList<OrdemServico> findByOrderByDescValor();
   //pela palvara chave
   
}
