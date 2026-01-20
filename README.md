# 🍕 Gerenciador de Pedidos - Pizzaria API
## 📖 Sobre o Projeto
API desenvolvida para o gerenciamento de pedidos de uma pizzaria. O objetivo é controlar todo o fluxo do estabelecimento, desde o cadastro de produtos até a preparação e entrega.

Este projeto faz parte do meu portfólio pessoal e está em constante evolução.

## 📐 Modelagem do Sistema
Antes do desenvolvimento, o sistema foi estruturado utilizando UML.
Você pode visualizar o **Diagrama de Classes completo** clicando no link abaixo:

📄 [Ver Diagrama de Classes (PDF)](src/main/resources/docs/diagramaPizzaria.pdf)

## 🚀 Tecnologias Utilizadas
O projeto foi desenvolvido utilizando as seguintes tecnologias:

* **Java 17**
* **Spring Boot 4.0.0**
* **Spring Web** (API REST)
* **Spring Data JPA** (Persistência)
* **PostgreSQL** (Banco de dados)
* **Lombok** (Produtividade)

## ⚙️ Funcionalidades e Roteiro

### ✅ Implementado (Atual)
* **Gerenciamento de Produtos (CRUD):**
    * Cadastro de pizzas e bebidas.
    * Listagem completa do cardápio.
    * Atualização de preços e detalhes.
    * Remoção de produtos.

### 🚧 Em Desenvolvimento / Futuro
O projeto contará com interfaces específicas para diferentes perfis de usuário:

* **👨‍🍳 Interface do Pizzaiolo:**
    * Visualização em tempo real dos pedidos recebidos.
    * Alteração de status dos pedidos (ex: "Em preparação", "Pronto", "Saiu para entrega").

* **👔 Interface do Gerente:**
    * Gerenciamento administrativo do cardápio (Adicionar/Remover itens).
    * Geração de relatórios de vendas para análise de desempenho.

* **📦 Outras melhorias planejadas:**
    * Cadastro de Clientes.
    * Sistema de Autenticação e Autorização (Login).

## 📦 Como Executar

### Pré-requisitos
* Java 17
* PostgreSQL
* Maven

### Passo a passo
1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/matquirin0/pizzaria-project.git](https://github.com/matquirin0/pizzaria-project.git)
    ```
2.  **Configure o Banco de Dados:**
    Ajuste o arquivo `src/main/resources/application.properties` com suas credenciais do PostgreSQL.
3.  **Execute o projeto:**
    ```bash
    ./mvnw spring-boot:run
    ```
