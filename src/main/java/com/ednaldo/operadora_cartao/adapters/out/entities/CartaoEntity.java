package com.ednaldo.operadora_cartao.adapters.out.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cartao")
public class CartaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private LocalDate dataExpiracao;
    private String cvv;
    private double limite;
    private double availableLimit;
    private LocalDate ultimaAlteracaoLimite;
    private Integer dataVencimentoFatura;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private ClienteEntity cliente;

    public CartaoEntity(String numeroCartao, LocalDate dataExpiracao, String cvv, double limiteCredito, ClienteEntity cliente, LocalDate ultimaAlteracaoLimite, Integer dataVencimentoFatura) {
    }
}
