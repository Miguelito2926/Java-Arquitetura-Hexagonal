package com.ednaldo.operadora_cartao.adapters.mapper;

import com.ednaldo.operadora_cartao.adapters.in.dto.ClienteRequestDTO;
import com.ednaldo.operadora_cartao.adapters.in.dto.ClienteResponseDTO;
import com.ednaldo.operadora_cartao.adapters.out.entities.ClienteEntity;
import com.ednaldo.operadora_cartao.application.domain.CartaoDomain;
import com.ednaldo.operadora_cartao.application.domain.ClienteDomain;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface IClienteMapper {

    ClienteEntity paraClienteEntity(ClienteDomain clienteDomain);
    ClienteDomain paraClienteDomain(ClienteEntity clienteEntity);

    @Mapping(target = "cartao", expression = "java(toCartaoDomain(cliente))")
    ClienteDomain toDomain(ClienteRequestDTO cliente);

    ClienteResponseDTO toResponse(ClienteDomain cliente);

    @Mapping(source = "dataVencimentoFatura", target = "dataVencimentoFatura")
    CartaoDomain toCartaoDomain(ClienteRequestDTO clienteRequestDTO);
}
