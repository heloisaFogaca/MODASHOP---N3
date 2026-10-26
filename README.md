# ModaShop – E-commerce de Roupas

API REST de uma loja virtual de roupas, desenvolvida em **Java 17** e **Spring Boot 3** com **Spring Data JPA**. Controla catálogo, estoque por tamanho e cor, carrinho, pedidos e pagamentos.

> Projeto acadêmico – **Etapa 1**: requisitos, modelagem UML e camada de persistência (JPA).

## Equipe

| Integrante | Função |
|------------|--------|
| _(nome)_ | Líder |
| _(nome)_ | |

## Documentação

A documentação completa (requisitos, diagrama de classes UML e dicionário de dados) está em [docs/DOCUMENTACAO.md](docs/DOCUMENTACAO.md).

## Tecnologias

- Java 17
- Spring Boot 3.3 (Web, Data JPA, Validation)
- H2 (desenvolvimento) e PostgreSQL (produção)
- Lombok
- Maven

## Como executar

Pré-requisitos: JDK 17 e Maven.

```bash
mvn spring-boot:run
```

A aplicação sobe em `http://localhost:8080`. Por padrão usa o banco H2 em memória, e o console fica em `http://localhost:8080/h2-console`:

| Campo | Valor |
|-------|-------|
| JDBC URL | `jdbc:h2:mem:modadb` |
| User | `sa` |
| Password | _(vazio)_ |

## Estrutura

```
src/main/java/com/modashop/ecommerce
├── entity       # Entidades JPA (User, Product, Order, ...)
├── enums        # Role, OrderStatus, PaymentStatus, PaymentMethod
└── repository   # Repositórios Spring Data JPA
```

## Entidades

`User`, `Address`, `Category`, `Product`, `ProductVariant`, `Order`, `OrderItem`, `Payment`, `Review`.
