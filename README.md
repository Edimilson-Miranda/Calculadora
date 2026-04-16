# 🧮 Calculadora em Java

Este projeto é uma calculadora simples desenvolvida em Java que funciona via terminal. O sistema permite ao usuário escolher operações matemáticas básicas e inserir dois valores para obter o resultado.

---

## ✨ Funcionalidades

- ➕ Soma  
- ➖ Subtração  
- ✖️ Multiplicação  
- ➗ Divisão  
- 🔁 Execução contínua com loop  
- ✅ Validação de entrada do menu  
- 💻 Interação via terminal (CLI)  

---

## 🛠️ Tecnologias e Conceitos Utilizados

- Java  
- Lógica de programação  
- Estruturas condicionais (`if`, `switch`)  
- Laços de repetição (`while`)  
- Manipulação de entrada de dados (`Scanner`)  
- Controle de fluxo da aplicação  

---

## 🧠 Lógica do Programa

O fluxo da aplicação segue os seguintes passos:

1. Exibe o menu de opções  
2. Recebe a escolha do usuário  
3. Valida a opção informada  
4. Solicita dois números  
5. Realiza o cálculo correspondente  
6. Exibe o resultado  
7. Repete o processo até o usuário encerrar  

---

## 📋 Menu de Opções
    1 - Somar
    2 - Subtrair
    3 - Multiplicar
    4 - Dividir
    0 - Sair


---


---

## ▶️ Como Executar

### Pré-requisitos
- Java JDK 8 ou superior instalado  

### Passos

    ```bash
    # Clonar o repositório
    git clone https://github.com/Edimilson-Miranda/Calculadora

    # Acessar a pasta
    cd Calculadora

    # Compilar
    javac Main.java

    # Executar
    java Main

## 💻 Exemplo de Execução

    ---------------------------
    Calculadora
    --------------------------
    1 - Somar
    2 - Subtrair
    3 - Multiplicar
    4 - Dividir
    0 - Sair
    Digite sua escolha: 1

    Digite seu primeiro número:
    10
    Digite seu segundo número:
    5
    -------------------------
    Resultado: 15.0

## 🧩 Estrutura do Código
    | Método        | Descrição                              |
    | ------------- | -------------------------------------- |
    | `main`        | Controla o fluxo principal do programa |
    | `mostraMenu`  | Exibe o menu e captura a escolha       |
    | `calcular`    | Executa a operação matemática          |
    | `opcaoValida` | Valida a opção escolhida               |


## ⚠️ Observações
   - O programa aceita apenas números do tipo double
  -  Caso o usuário digite uma opção inválida, será exibida uma mensagem de erro

