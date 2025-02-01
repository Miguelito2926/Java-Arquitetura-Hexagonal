package com.ednaldo.operadora_cartao.adapters.in.dto;

public record CartaoResponseDTO(String numero,
                                String dataExpiracao,
                                String cvv,
                                double limite) {}
