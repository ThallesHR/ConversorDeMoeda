# 🪙Conversor de Moeda
<p align="center"> <img src="https://img.shields.io/static/v1?label=Status&message=Conclu%C3%ADdo&color=success&style=for-the-badge" alt="Status Concluído"> <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java"> <img src="https://img.shields.io/github/last-commit/ThallesHR/ConversorMoeda?style=for-the-badge" alt="Último Commit"> </p>

Uma ferramenta prática e eficiente para conversão de moedas em tempo real, conectando você às cotações globais diretamente pelo terminal.

## 🛠️ Tecnologias e Ferramentas
O projeto foi construído utilizando o que há de mais moderno no ecossistema Java:

Java 17+: Utilização de Records para uma estrutura de dados limpa e imutável.

IntelliJ IDEA: Ambiente de desenvolvimento otimizado.

Gson (Google): Manipulação inteligente de dados JSON recebidos da API.

ExchangeRate-API: Interface de dados para taxas de câmbio em tempo real.

## ✨ Funcionalidades Principais
O conversor oferece um menu interativo com as seguintes opções:

✅ Conversão Direta: Dólar (USD) para moedas da América Latina (BRL, ARS, COP).

✅ Conversão Reversa: Transforme moedas locais de volta para Dólar instantaneamente.

✅ Dados em Tempo Real: Consumo de API externa via HttpClient.

✅ Interface Amigável: Menu numerado via console para facilitar a navegação do usuário.

## 📂 Organização do Projeto
A arquitetura foi pensada para ser modular e fácil de manter:

Main.java: Gerencia o fluxo de interação e o menu.

Conversor.java: Responsável pelas requisições HTTP e lógica de comunicação com a API.

Moeda.java: Modelo de dados (Record) que mapeia a resposta da conversão.

## 🚀 Como Executar
Clone o repositório.

Abra o projeto no IntelliJ IDEA.

Certifique-se de que a biblioteca Gson está configurada nas dependências do projeto.

Execute o arquivo Main.java.

<p align="center"> Desenvolvido por <a href="https://github.com/ThallesHR">ThallesHR</a> 👨‍💻 </p>
