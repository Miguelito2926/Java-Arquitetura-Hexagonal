# Cliente API - Arquitetura Hexagonal

## Visão Geral
Este projeto segue a Arquitetura Hexagonal (Ports and Adapters), garantindo maior desacoplamento entre os componentes, facilitando testes, manutenção e extensibilidade do sistema.

## Estrutura do Projeto
A arquitetura é dividida em três camadas principais:

### 1. **Camada de Aplicação (Application)**
Responsável por conter as regras de negócio da aplicação.
- **Pacote:** `com.ednaldo.operadora_cartao.application.domain`
- **Classe Principal:** `ClienteDomain`

### 2. **Camada de Entrada (Adapters - IN)**
Responsável por receber as requisições e direcioná-las para a camada de aplicação.
- **Pacote:** `com.ednaldo.operadora_cartao.adapters.in`
- **Controller:** `ClienteController`
- **DTOs:** `ClienteRequestDTO`, `ClienteResponseDTO`
- **Mapper:** `IClienteMapper`
- **Service Port:** `IClienteService`

### 3. **Camada de Saída (Adapters - OUT)**
Interface com bancos de dados, APIs externas e qualquer outro sistema externo.
- **Pacote:** `com.ednaldo.operadora_cartao.adapters.out`
- Implementa a interface `IClienteService` para comunicação com repositórios e serviços externos.

## Endpoints Disponíveis

### 1. **Solicitar Cartão**
**URL:** `POST /cliente`
- **Request Body:**
```json
{
  "nome": "João Silva",
  "cpf": "12345678900",
  "renda": 5000.00
}
```
- **Response:** `200 OK`

### 2. **Buscar Cliente por CPF**
**URL:** `GET /cliente?cpf={cpf}`
- **Response:**
```json
{
  "id": 1,
  "nome": "João Silva",
  "cpf": "12345678900",
  "cartoes": [
    {
      "numero": "1234-5678-9012-3456",
      "limite": 10000.00
    }
  ]
}
```

## Tecnologias Utilizadas
- **Spring Boot** - Framework principal
- **Lombok** - Redução de código boilerplate
- **MapStruct** - Mapeamento de objetos DTO
- **Arquitetura Hexagonal** - Implementação de Ports & Adapters

## Autor
Desenvolvido por **Ednaldo Tavares**.

