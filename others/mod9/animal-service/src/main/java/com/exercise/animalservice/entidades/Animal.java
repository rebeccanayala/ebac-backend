package com.exercise.animalservice.entidades;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String nomeProvisorio;

    @Column(nullable = false)
    private Integer idadeEstimada;

    @Column(nullable = false)
    private String raca;

    @Column(nullable = false)
    private Date dataEntrada;

    @Column
    private Date dataAdocao;

    @Column(nullable = false)
    private String condicoesChegada;

    @Column(nullable = false)
    private String nomeRecebedor;

    @Column
    private Date dataObito;

    @Column(nullable = false)
    private String porte;

    @Column(nullable = false)
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario resgatador;

    /**
     * @return Integer return the id
     */
    public Integer getId() {
        return id;
    }


    /**
     * @return String return the nomeProvisorio
     */
    public String getNomeProvisorio() {
        return nomeProvisorio;
    }

    /**
     * @param nomeProvisorio the nomeProvisorio to set
     */
    public void setNomeProvisorio(String nomeProvisorio) {
        this.nomeProvisorio = nomeProvisorio;
    }

    /**
     * @return Integer return the idadeEstimada
     */
    public Integer getIdadeEstimada() {
        return idadeEstimada;
    }

    /**
     * @param idadeEstimada the idadeEstimada to set
     */
    public void setIdadeEstimada(Integer idadeEstimada) {
        this.idadeEstimada = idadeEstimada;
    }

    /**
     * @return String return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return Date return the dataEntrada
     */
    public Date getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return Date return the dataAdocao
     */
    public Date getDataAdocao() {
        return dataAdocao;
    }

    /**
     * @param dataAdocao the dataAdocao to set
     */
    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    /**
     * @return String return the condicoesChegada
     */
    public String getCondicoesChegada() {
        return condicoesChegada;
    }

    /**
     * @param condicoesChegada the condicoesChegada to set
     */
    public void setCondicoesChegada(String condicoesChegada) {
        this.condicoesChegada = condicoesChegada;
    }

    /**
     * @return String return the nomeRecebedor
     */
    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    /**
     * @param nomeRecebedor the nomeRecebedor to set
     */
    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    /**
     * @return Date return the dataObito
     */
    public Date getDataObito() {
        return dataObito;
    }

    /**
     * @param dataObito the dataObito to set
     */
    public void setDataObito(Date dataObito) {
        this.dataObito = dataObito;
    }

    /**
     * @return String return the porte
     */
    public String getPorte() {
        return porte;
    }

    /**
     * @param porte the porte to set
     */
    public void setPorte(String porte) {
        this.porte = porte;
    }

    /**
     * @return String return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return Funcionario return the resgatador
     */
    public Funcionario getResgatador() {
        return resgatador;
    }

    /**
     * @param resgatador the resgatador to set
     */
    public void setResgatador(Funcionario resgatador) {
        this.resgatador = resgatador;
    }

}
