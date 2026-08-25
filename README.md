# BusiFind

BusiFind é uma aplicação web desenvolvida em Java com Spring Boot e Thymeleaf para consulta simplificada de dados cadastrais de empresas brasileiras através do número de CNPJ. A aplicação integra com a API pública da plataforma CNPJá para recuperar e exibir informações em tempo real.

---

## Funcionalidades

- **Consulta por CNPJ:** Permite ao usuário buscar dados de uma empresa informando o CNPJ.
- **Sanitização de Entrada:** Remove automaticamente caracteres especiais (pontos, barras e traços) digitados pelo usuário antes da consulta.
- **Exibição de Dados:** Apresenta Razão Social, Nome Fantasia e CNPJ da empresa encontrada.
- **Tratamento de Erros:** Valida a busca e apresenta mensagens claras caso o CNPJ não seja encontrado ou seja inválido.

---

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 4**
- **Spring Web MVC**
- **Thymeleaf** (Template Engine)
- **RestTemplate** (Cliente HTTP para integração com API externa)
- **Maven** (Gerenciador de dependências e build)
- **HTML5 e CSS3**

---

## Estrutura do Projeto

```text
busifind/
├── src/
│   ├── main/
│   │   ├── java/br/com/matthslva/busifind/
│   │   │   ├── controller/
│   │   │   │   └── EmpresaController.java   # Mapeamento de rotas e integração com as views
│   │   │   ├── dto/
│   │   │   │   └── EmpresaDTO.java          # Mapeamento dos dados retornados da API
│   │   │   ├── service/
│   │   │   │   └── EmpresaService.java      # Lógica de negócio e chamada à API externa
│   │   │   └── BusifindApplication.java     # Classe principal da aplicação Spring Boot
│   │   └── resources/
│   │       ├── templates/
│   │       │   └── index.html               # Interface do usuário com Thymeleaf
│   │       └── application.properties       # Configurações do Spring Boot
│   └── test/                                # Testes unitários e de integração
├── mvnw / mvnw.cmd                          # Wrapper do Maven
└── pom.xml                                  # Arquivo de configuração de dependências Maven
```

---

## Rotas da Aplicação

| Método | Rota | Descrição |
|---|---|---|
| `GET` | `/` | Exibe a página inicial com o formulário de busca. |
| `GET` | `/buscar?cnpj={cnpj}` | Realiza a consulta na API e retorna os dados da empresa na página. |

---

## Pré-requisitos

- **Java Development Kit (JDK) 17** ou superior instalado.
- **Git** instalado.

---

## Como Executar

### 1. Clonar o repositório
```bash
git clone https://github.com/matthslva/busifind.git
cd busifind
```

### 2. Executar a aplicação

Utilizando o Maven Wrapper incluído no projeto:

- **Windows (PowerShell ou CMD):**
  ```cmd
  .\mvnw spring-boot:run
  ```

- **Linux ou macOS:**
  ```bash
  ./mvnw spring-boot:run
  ```

### 3. Acessar no navegador

Após iniciar a aplicação, acesse:
[http://localhost:8080](http://localhost:8080)

---

## Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter mais informações.
