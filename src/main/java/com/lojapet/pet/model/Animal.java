package com.lojapet.pet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // indica que a classe é armazenável no banco
@Table(name = "animal") // torno explicito o nome da tabela
public class Animal {

    @Column(name = "idanimal") // explicito o nome da coluna
	@Id // PK coresponde a chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private Integer idanimal;

	@Column(name = "nome", length = 100, nullable = false)
	//garantir que nos passemos um nome com pelo menos um caracter
	private String nome;

	@Column(name = "idade", nullable = false)
	private Integer idade;

    @Column(name = "peso", nullable = false)
	private Double peso;
    @ManyToOne
    @JoinColumn(name = "cliente_idcliente")
    @JsonIgnoreProperties("listAnimais")
    private Cliente cliente;




    public Integer getIdanimal() {
        return idanimal;
    }
    public void setIdanimal(Integer idanimal) {
        this.idanimal = idanimal;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
