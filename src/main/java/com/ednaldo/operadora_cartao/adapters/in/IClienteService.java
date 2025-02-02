package com.ednaldo.operadora_cartao.adapters.in;

import com.ednaldo.operadora_cartao.application.domain.CartaoDomain;
import com.ednaldo.operadora_cartao.application.domain.ClienteDomain;

public interface IClienteService {

    ClienteDomain solicitarCartao(ClienteDomain cliente);

    ClienteDomain buscarPorCpf(String cpf);
}
