package com.ednaldo.operadora_cartao.application.services;

import com.ednaldo.operadora_cartao.adapters.in.IClienteService;
import com.ednaldo.operadora_cartao.application.domain.CartaoDomain;
import com.ednaldo.operadora_cartao.application.domain.ClienteDomain;
import com.ednaldo.operadora_cartao.porters.out.IClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements IClienteService {

    private final IClienteRepository iClienteRepository;
    private final GeraDadosCartaoService geraCartao;

    @Override
    public ClienteDomain solicitarCartao(ClienteDomain cliente) {
        if (iClienteRepository.buscarUsuarioPOrEmail(cliente.getEmail())) {
            throw new IllegalArgumentException("Usuário já possui um cartão.");
        }

        CartaoDomain cartao = geraCartao.gerarParaCliente(cliente);
        cliente.setCartao(cartao);
        return iClienteRepository.salva(cliente);

    }

    @Override
    public ClienteDomain buscarPorCpf(String cpf) {
        return iClienteRepository.buscarUsuarioPorCpf(cpf).
                orElseThrow(()-> new IllegalArgumentException("Cliente não encontrado"));
    }
}