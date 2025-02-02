package com.ednaldo.operadora_cartao.adapters.out.repositories;

import com.ednaldo.operadora_cartao.adapters.out.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IClienteJpaRepository extends JpaRepository<ClienteEntity, Long> {

    Boolean existsByEmail(String email);
    Optional<ClienteEntity> findByCpf(String cpf);
}
