package com.ednaldo.operadora_cartao.application.domain;

import java.time.LocalDate;
import java.util.Objects;


public class CartaoDomain {

    private Long id;
    private String numero;
    private LocalDate dataExpiracao;
    private String cvv;
    private double limite;
    private double availableLimit;
    private LocalDate ultimaAlteracaoLimite;
    private Integer dataVencimentoFatura;
    private ClienteDomain cliente;

    public CartaoDomain() {
    }

    public CartaoDomain(Long id, String numero, LocalDate dataExpiracao, String cvv, double limite, double availableLimit, LocalDate ultimaAlteracaoLimite, Integer dataVencimentoFatura, ClienteDomain cliente) {
        this.id = id;
        this.numero = numero;
        this.dataExpiracao = dataExpiracao;
        this.cvv = cvv;
        this.limite = limite;
        this.availableLimit = availableLimit;
        this.ultimaAlteracaoLimite = ultimaAlteracaoLimite;
        this.dataVencimentoFatura = dataVencimentoFatura;
        this.cliente = cliente;
    }

    public CartaoDomain(String numeroCartao, LocalDate dataExpiracao, String cvv, double limiteCredito, ClienteDomain cliente, LocalDate ultimaAlteracaoLimite, Integer dataVencimentoFatura) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(double availableLimit) {
        this.availableLimit = availableLimit;
    }

    public LocalDate getUltimaAlteracaoLimite() {
        return ultimaAlteracaoLimite;
    }

    public void setUltimaAlteracaoLimite(LocalDate ultimaAlteracaoLimite) {
        this.ultimaAlteracaoLimite = ultimaAlteracaoLimite;
    }

    public Integer getDataVencimentoFatura() {
        return dataVencimentoFatura;
    }

    public void setDataVencimentoFatura(Integer dataVencimentoFatura) {
        this.dataVencimentoFatura = dataVencimentoFatura;
    }

    public ClienteDomain getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDomain cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartaoDomain that = (CartaoDomain) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "CartaoDomain{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", dataExpiracao=" + dataExpiracao +
                ", cvv='" + cvv + '\'' +
                ", limite=" + limite +
                ", availableLimit=" + availableLimit +
                ", ultimaAlteracaoLimite=" + ultimaAlteracaoLimite +
                ", dataVencimentoFatura=" + dataVencimentoFatura +
                ", cliente=" + cliente +
                '}';
    }
}