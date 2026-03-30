# TAP - Técnicas Avançadas de Programação 🧠💻

Repositório dedicado ao versionamento das atividades práticas desenvolvidas na disciplina de **Técnicas Avançadas de Programação**. Aqui estarão reunidos todos os exercícios propostos em aula, com foco no desenvolvimento backend e no uso de arquiteturas modernas.

## 🎯 Objetivo
Registrar minha evolução na disciplina, mantendo um histórico bem estruturado das atividades, boas práticas de código e conceitos avançados de engenharia de software.

## 🛠️ Tecnologias Utilizadas
- **Java**
- **Spring Boot**
- **Maven**
- **JSON**
- Outras poderão ser adicionadas conforme a disciplina evolui.

## 📂 Estrutura das Atividades

### `Atividade1/`
Implementação de um **ProductsController**, responsável por retornar uma lista de produtos em formato **JSON**.

Inclui:
- Criação do endpoint  
- Estruturação do modelo `Product`  
- Retorno de dados fixos para testes  
- Exercício introdutório ao uso de controllers no Spring

---

### `Atividade2/`
Implementação de um **MusicsController**, retornando uma lista de músicas também em **JSON**.

Abrange:
- Criação do modelo `Music`  
- Endpoint fornecendo dados simulados  
- Prática de manipulação de listas e responses HTTP

---

## 🚀 Como executar o projeto

```bash
# Clone o repositório
git clone https://github.com/Ricardo-GabrielX/TAP.git

# Acesse a pasta do projeto
cd TAP

# Compile e execute (Spring Boot com Maven Wrapper)
./mvnw spring-boot:run
