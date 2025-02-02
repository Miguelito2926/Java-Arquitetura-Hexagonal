package com.ednaldo.operadora_cartao.adapters.out;

import com.ednaldo.operadora_cartao.adapters.mapper.IClienteMapper;
import com.ednaldo.operadora_cartao.adapters.out.repositories.IClienteJpaRepository;
import com.ednaldo.operadora_cartao.application.domain.ClienteDomain;
import com.ednaldo.operadora_cartao.porters.out.IClienteRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ClienteRepositoryImpl implements IClienteRepository {

    private final IClienteJpaRepository clienteJpaRepository;
    private final IClienteMapper clienteMapper;

    public ClienteRepositoryImpl(IClienteJpaRepository clienteJpaRepository, IClienteMapper clienteMapper) {
        this.clienteJpaRepository = clienteJpaRepository;
        this.clienteMapper = clienteMapper;
    }

    @Override
    public ClienteDomain salva(ClienteDomain clienteDomain) {
        return clienteMapper.paraClienteDomain(
                clienteJpaRepository.save(
                        clienteMapper.paraClienteEntity(clienteDomain)
                )
        );
    }

    @Override
    public Boolean buscarUsuarioPOrEmail(String email) {
        return clienteJpaRepository.existsByEmail(email);
    }

    @Override
    public Optional<ClienteDomain> buscarUsuarioPorCpf(String cpf) {
        return clienteJpaRepository.findByCpf(cpf).map(clienteMapper::paraClienteDomain);
    }
}
