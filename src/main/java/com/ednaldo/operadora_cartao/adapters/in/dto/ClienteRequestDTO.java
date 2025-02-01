package com.ednaldo.operadora_cartao.adapters.in.dto;

public record ClienteRequestDTO (String nome,
                                 String email,
                                 Integer idade,
                                 String cpf,
                                 EnderecoRequestDTO endereco,
                                 double rendaMensal,
                                 String dataVencimentoFatura){}