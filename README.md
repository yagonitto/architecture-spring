# 📚 Projeto de Estudos com Spring Boot

Repositório criado para estudo do **Spring Boot** com **Java 25** e **Maven**, explorando desde o ciclo de vida da aplicação até conceitos avançados de *beans* e configuração.

---

## 🎯 Objetivo

Este projeto tem como propósito:

- Entender a estrutura básica de uma aplicação Spring Boot  
- Explorar o funcionamento do *Application Context*  
- Criar e gerenciar *beans* e *components*  
- Praticar injeção de dependências e escopos de *beans*  
- Trabalhar com *lazy beans*  
- Acessar propriedades de configuração (*configuration properties*)  
- Implementar uma pequena API REST para aplicar os conceitos na prática  

---

## 📌 Tópicos Estudados

### 1\. Classe `Application`

- Ponto de entrada da aplicação (`public static void main`)  
- Uso de `SpringApplication.run(...)` para inicializar o contexto  
- Relação entre a classe `Application` e o *Application Context*  

### 2\. Application Context

- Container responsável por criar, gerenciar e injetar *beans*  
- Leitura de anotações, configurações e propriedades  
- Registro de *components*, *configurations* e *beans*  

### 3\. `@Configuration` e `@Bean`

- Uso de `@Configuration` para classes de configuração  
- Definição de *beans* com `@Bean`  
- Entendimento do ciclo de vida dos *beans* dentro do container  

### 4\. `@Primary` e `@Qualifier`

- `@Primary`: define o *bean* padrão quando existem múltiplas implementações  
- `@Qualifier`: seleciona explicitamente qual implementação injetar  
- Exemplos com mais de um *bean* do mesmo tipo  

### 5\. *Components* e Injeção de Dependências

- Estereótipos do Spring:
  - `@Component`  
  - `@Service`  
  - `@Repository`  
  - `@Controller` / `@RestController`  

- Formas de injeção:
  - Via construtor (recomendada)  
  - Via `@Autowired`  

### 6\. Escopo dos Beans

- Escopos estudados:
  - `singleton`  
  - `prototype`  
  - (opcionalmente) `request`, `session`  

- Impacto de cada escopo no ciclo de vida e uso dos *beans*  

### 7\. Lazy Beans

- Uso de `@Lazy` para adiar a criação do *bean* até o primeiro uso  
- Diferença entre *beans* *eager* (padrão) e *lazy*  
- Cenários em que `@Lazy` é útil  

### 8\. Configuration Properties

- Leitura de propriedades em `application.properties` ou `application.yml`  
- Uso de:
  - `@Value` para propriedades pontuais  
  - `@ConfigurationProperties` para grupos de propriedades tipadas  

---

## 🌐 Pequena API REST

O projeto inclui uma API REST simples para demonstrar os conceitos:

- Endpoints expostos com `@RestController`  
- Injeção de *services* nos *controllers*  
- Uso de *beans* definidos no contexto  
- Acesso a propriedades de configuração dentro dos serviços  

---

## 🛠 Tecnologias Utilizadas

- Java 25  
- Spring Boot  
- Maven  

---

## ▶️ Como Executar o Projeto

1\. Pré\-requisitos:

- Java 25 instalado e configurado no `PATH`  
- Maven instalado (ou uso do *wrapper* do Maven)  

2\. Clonar o repositório:

```bash
git clone <url-do-repositorio>
cd <pasta-do-projeto>
```

3\. Executar a aplicação:

```bash
mvn spring-boot:run
```
Ou, se preferir usar o *wrapper* do Maven:

```bash
./mvnw spring-boot:run
```

4\. Acessar a API:
A API estará disponível em `http://localhost:8080/` (ou outra porta configurada).
---

---

## ✅ Conclusão

Este projeto foi desenvolvido com foco em prática e entendimento dos principais conceitos do Spring Boot, como *Application Context*, *beans*, escopos, injeção de dependências e propriedades de configuração.  

Ele serve como uma base de estudos para reforçar a teoria com exemplos reais de código e pode ser estendido com novos módulos, endpoints e experimentos conforme a necessidade.

Sinta\-se à vontade para adaptar, evoluir e testar novas ideias a partir deste projeto.