package com.ednaldo.operadora_cartao.porters.out;

import com.ednaldo.operadora_cartao.application.domain.ClienteDomain;

import java.util.Optional;

public interface IClienteRepository {

    ClienteDomain salva(ClienteDomain clienteDomain);

    Boolean buscarUsuarioPOrEmail(String email);

    Optional<ClienteDomain> buscarUsuarioPorCpf(String cpf);
}
