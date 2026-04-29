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