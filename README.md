# Processamento de Contrato com Parcelamento

Projeto em Java desenvolvido com o objetivo de praticar **Programação Orientada a Objetos**, com foco especial no uso de **interfaces**, **injeção de dependência** e **separação de responsabilidades**.

## 📌 Descrição

O sistema simula o processamento de um contrato, dividindo um valor total em parcelas mensais.  
Cada parcela sofre a aplicação de:
- Juros mensais
- Taxa de pagamento online

O cálculo das taxas é feito através de um serviço de pagamento, definido por uma interface, permitindo flexibilidade e baixo acoplamento.

## 🧠 Conceitos utilizados

- Programação Orientada a Objetos (POO)
- Interfaces
- Inversão de Dependência (DIP)
- Injeção de Dependência via construtor
- Encapsulamento
- API de Datas (`java.time`)
- Formatação de datas e valores

## 🗂 Estrutura do projeto
```
application
└── Program.java

model
├── entities
│ ├── Contract.java
│ └── Installment.java
└── services
├── OnlinePaymentService.java
├── PayPalService.java
└── ContractService.java
```

## ⚙️ Regras de negócio

- O valor do contrato é dividido igualmente pelo número de parcelas.
- Juros: **1% ao mês** sobre o valor da parcela.
- Taxa de pagamento: **2%** sobre o valor com juros.
- Cada parcela possui uma data de vencimento mensal a partir da data do contrato.

## ▶️ Exemplo de uso

O usuário informa:
- Número do contrato
- Data do contrato
- Valor total
- Número de parcelas

O sistema exibe a lista de parcelas com:
- Data de vencimento
- Valor final da parcela

## 🚀 Tecnologias

- Java
- Paradigma OO
- API `java.time`

## 📚 Objetivo educacional

Projeto desenvolvido para fins de estudo, especialmente para compreensão prática do uso de **interfaces e desacoplamento** em Java.

---

Desenvolvido por André Almeida
