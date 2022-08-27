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
@Table(name = "ordem_servico") // torno explicito o nome da tabela
public class OrdemServico {

    @Column(name = "idordem_servico") // explicito o nome da coluna
    @Id // PK coresponde a chave primaria da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private Integer idordem_servico;

    @Column(name = "valor", nullable = false)
    // garantir que nos passemos um nome com pelo menos um caracter
    private Double valor;

    @Column(name = "entrada", length = 45, nullable = false)
    private String entrada;

    @Column(name = "saida", length = 45, nullable = false)
    private String saida;
    // perguntar
    @ManyToOne
    @JoinColumn(name = "cliente_idcliente")
    @JsonIgnoreProperties("listlistServicos")
    private Cliente cliente;

    public Integer getIdordem_servico() {
        return idordem_servico;
    }

    public void setIdordem_servico(Integer idordem_servico) {
        this.idordem_servico = idordem_servico;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
