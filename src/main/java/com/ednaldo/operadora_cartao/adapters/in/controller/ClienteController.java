package com.ednaldo.operadora_cartao.adapters.in.controller;


import com.ednaldo.operadora_cartao.adapters.in.IClienteService;
import com.ednaldo.operadora_cartao.adapters.in.dto.ClienteRequestDTO;
import com.ednaldo.operadora_cartao.adapters.in.dto.ClienteResponseDTO;
import com.ednaldo.operadora_cartao.adapters.mapper.IClienteMapper;
import com.ednaldo.operadora_cartao.application.domain.ClienteDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cliente")
public class ClienteController {

    private final IClienteService iClienteServicePort;
    private final IClienteMapper mapper;

    @PostMapping
    public ResponseEntity<ClienteResponseDTO> solicitaCartao(@RequestBody ClienteRequestDTO clienteRequestDTO) {
        mapper.toResponse(iClienteServicePort.solicitarCartao(mapper.toDomain(clienteRequestDTO)));
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<ClienteResponseDTO> buscaClientePorCpf(@RequestParam String cpf) {
        ClienteDomain cliente = iClienteServicePort.buscarPorCpf(cpf);
        return ResponseEntity.ok(mapper.toResponse(cliente));
    }
}
