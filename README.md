# Calculadora em Java

Este projeto é uma calculadora simples desenvolvida em Java que funciona via terminal. O usuário pode escolher operações matemáticas básicas e inserir dois números para obter o resultado.
  


###  ✨ Funcionalidades

    ➕ Soma
    ➖ Subtração
    ✖️ Multiplicação
    ➗ Divisão
    🔁 Execução contínua (loop)
    ✅ Validação de entrada do menu 


### 🧠 Lógica do Programa

    O fluxo da aplicação segue os seguintes passos:

    Exibe o menu de opções
    Recebe a escolha do usuário
    Valida a opção informada
    Solicita dois números
    Realiza o cálculo correspondente
    Exibe o resultado
    Repete o processo até o usuário sair

### 📋 Menu de Opções

    1 - Somar
    2 - Subtrair
    3 - Multiplicar
    4 - Dividir
    0 - Sair

### ▶️ Como Executar

    Pré-requisitos
    Java JDK instalado (versão 8 ou superior)

     Passos
        # Compilar o código
        javac Main.java

        # Executar o programa
        java Main

### 💻 Exemplo de Execução

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

    ---------------------------
    Calculadora
    --------------------------
    1 - Somar
    2 - Subtrair
    3 - Multiplicar
    4 - Dividir
    0 - Sair
    Digite sua escolha: 4

    Digite seu primeiro número:
    20
    Digite seu segundo número:
    4
    -------------------------
    Resultado: 5.0

    Digite sua escolha: 0
    Saindo...........

### 🛠️ Estrutura do Código

    | Método        | Descrição                              |
    | ------------- | -------------------------------------- |
    | `main`        | Controla o fluxo principal do programa |
    | `mostraMenu`  | Exibe o menu e captura a escolha       |
    | `calcular`    | Executa a operação matemática          |
    | `opcaoValida` | Valida a opção escolhida               |

### ⚠️ Observações

  - O programa aceita apenas números do tipo double
  - Caso o usuário digite uma opção inválida, será exibida uma mensagem de erro
