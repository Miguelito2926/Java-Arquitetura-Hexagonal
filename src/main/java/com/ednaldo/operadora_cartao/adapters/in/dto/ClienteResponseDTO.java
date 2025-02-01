package com.ednaldo.operadora_cartao.adapters.in.dto;

public record ClienteResponseDTO(String nome,
                                 String email,
                                 Integer idade,
                                 String cpf,
                                 CartaoResponseDTO cartao){}