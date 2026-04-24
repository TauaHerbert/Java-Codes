# StoreLogicPOO - Sistema de Gestão de Varejo

Este projeto foi desenvolvido como um exercício prático para consolidar os fundamentos da **Programação Orientada a Objetos (POO)** em Java, simulando regras de negócio reais de um sistema de varejo.

## 🚀 Tecnologias e Conceitos Aplicados

### 1. Orientação a Objetos (POO)
* **Encapsulamento:** Implementado na classe `Product` para proteger atributos sensíveis e validar dados de entrada.
* **Herança:** Utilizada para criar a especialização `Eletronico` a partir da classe base `Product`, reaproveitando atributos comuns.
* **Polimorfismo:** Sobrescrita do método `calcularPrecoFinal` (`@Override`) para aplicar regras de acréscimo baseadas no tempo de garantia de eletrônicos.

### 2. Boas Práticas e Java Moderno
* **BigDecimal:** Uso da classe `BigDecimal` para manipulação de valores monetários, garantindo precisão decimal e evitando os erros de arredondamento comuns dos tipos `double` ou `float`.
* **Gestão de Fluxo:** Implementação de loops dinâmicos com `while` e coleções com `ArrayList` para permitir o cadastro de múltiplos itens em uma única execução.
* **Tratamento de Entrada:** Gerenciamento do buffer do teclado (`Scanner`) para evitar erros de leitura de dados (`NextLine skip`).

## 🛠️ Como rodar o projeto
1. Clone o repositório.
2. Importe o projeto no Eclipse ou sua IDE de preferência.
3. Execute a classe `Main.java`.