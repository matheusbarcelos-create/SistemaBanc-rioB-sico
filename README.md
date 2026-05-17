# 🏦 Bank System — Sistema Bancário em Java

Sistema bancário simples desenvolvido em Java, com funcionalidades de criação de contas, depósito, saque e exibição de saldo total do banco.

---

## 📋 Sobre o Projeto

Este projeto simula operações básicas de um banco via terminal. O usuário pode criar contas, realizar depósitos e saques, e ao final visualizar o saldo total de todas as contas cadastradas.

---

## ✨ Funcionalidades

- ✅ Criar conta bancária com nome do titular
- ✅ Realizar depósitos
- ✅ Realizar saques (com validação de saldo)
- ✅ Exibir dados de todas as contas cadastradas
- ✅ Exibir saldo total do banco
- ✅ Registro de operações (log de transações)
- ✅ Limite de 12 caracteres para o nome do titular

---

## 🗂️ Estrutura do Projeto

```
Bank/
├── App.java        # Classe principal — ponto de entrada e menu interativo
├── Banco.java      # Gerencia contas e calcula o saldo total
├── Conta.java      # Representa a conta bancária (saque, depósito, saldo)
└── Registro.java   # Log de operações realizadas
```

### Descrição das Classes

| Classe | Responsabilidade |
|---|---|
| `App` | Controla o fluxo de interação com o usuário via terminal |
| `Banco` | Armazena e gerencia a lista de contas, gera números de conta automaticamente |
| `Conta` | Realiza operações financeiras e valida regras de negócio |
| `Registro` | Registra e exibe logs das transações no console |

---

## 🖥️ Como Executar

### Pré-requisitos

- [Java JDK 11+](https://www.oracle.com/java/technologies/downloads/) instalado
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (IDE utilizada no desenvolvimento)

### Passos

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/matheusbarcelos-create/SistemaBanc-rioB-sico
   ```

2. **Abra o projeto no IntelliJ IDEA:**
   - `File` → `Open` → selecione a pasta do projeto

3. **Execute a classe principal:**
   - Navegue até `App.java`
   - Clique em **Run** (▶) ou pressione `Shift + F10`

---

## 🕹️ Como Usar

Ao iniciar o programa, o terminal exibirá um menu interativo:

```
O que deseja fazer? C=Criar uma conta , X=Sair
```

**Comandos disponíveis no menu principal:**

| Tecla | Ação |
|---|---|
| `C` | Criar uma nova conta |
| `X` | Encerrar o programa |

**Após criar uma conta, um segundo menu é exibido:**

```
Qual operação deseja? D=Depositar , S=Saque , X=Sair
```

| Tecla | Ação |
|---|---|
| `D` | Realizar um depósito |
| `S` | Realizar um saque |
| `X` | Sair da conta e voltar ao menu principal |

Ao sair, o sistema exibe todas as contas criadas e o **saldo total** do banco.

---

## 💡 Exemplo de Uso

```
O que deseja fazer? C=Criar uma conta , X=Sair
C
Digite seu nome:
Joao
Qual operação deseja? D=Depositar , S=Saque , X=Sair
D
Qual valor do depósito:
500
O depósito de R$: 500.0 Foi um sucesso!
S
Qual valor do saque:
200
X
Finalizando o programa! até breve!!

Conta: Joao 00341 / 1 Possui: R$ 300.0
O banco possui um total de R$: 300.0
```

---

## 🛠️ Tecnologias Utilizadas

- **Java** — Linguagem principal
- **IntelliJ IDEA** — IDE de desenvolvimento
- **Git** — Controle de versão

---

## 📌 Observações

- O nome do titular é limitado a **12 caracteres**; nomes maiores são cortados automaticamente.
- Saques com valor superior ao saldo disponível são **bloqueados** com mensagem de erro.
- Cada conta recebe um **número sequencial** gerado automaticamente pelo banco.

---

## 👨‍💻 Autor

Feito com ☕ e Java.  
Sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*!
