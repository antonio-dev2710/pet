package com.lojapet.pet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indica que a classe é armazenável no banco
@Table(name = "cliente") // torno explicito o nome da tabela

public class Cliente {
    @Column(name = "idcliente") // explicito o nome da coluna
	@Id // PK coresponde a chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private Integer idcliente;

	@Column(name = "nome", length = 100, nullable = false)
	//garantir que nos passemos um nome com pelo menos um caracter
	private String nome;

	@Column(name = "telefone", length = 45, nullable = false)
	private String telefone;

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

}
