# 📐 Calculadora de Áreas Geométricas

Projeto desenvolvido em **Java** para consolidar fundamentos de Programação Orientada a Objetos, com foco em arquitetura limpa e extensível.

## 🏗️ Conceitos Técnicos Aplicados

* **Interface (`AreaGeometrica`):** Criação de um contrato para padronizar o comportamento de diferentes formas através do método `getArea()`.
* **Polimorfismo:** Implementação que permite tratar múltiplos objetos (`Quadrado`, `Retangulo`, `Circulo`) de forma genérica pela interface.
* **Java Records:** Utilização de `records` para definição simplificada de classes de dados imutáveis, seguindo padrões modernos da linguagem (Java 17+).

## 📂 Estrutura do Pacote `CalculosGeometricos`

* **`AreaGeometrica`**: Interface base (Contrato).
* **`Main`**: Gerenciamento da lógica de interação e instanciamento.
* **`Quadrado`, `Retangulo` e `Circulo`**: Implementações que seguem a regra de negócio de cada forma.

---

## 🔄 Atualização (30/04/2026) — Refatoração para Paradigma Funcional

O projeto passou por uma refatoração significativa para implementar **Expressões Lambda** e **Interfaces Funcionais**.

* **Implementação de Lambdas:** A lógica de cálculo foi movida diretamente para a classe `Main`, sendo injetada dinamicamente através da interface `AreaGeometrica`.
* **Minimalismo Técnico:** Com a aplicação deste conceito, as classes físicas (`Quadrado`, `Retangulo` e `Circulo`) tornaram-se **opcionais**, pois o comportamento de cada forma é definido "on-the-fly".
* **Objetivo:** Reduzir a verbosidade do código e centralizar a resolução, tornando o projeto mais objetivo e alinhado com as práticas modernas do Java.

---