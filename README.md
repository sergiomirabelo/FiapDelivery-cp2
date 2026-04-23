# 🚚 Check Point 2 – Refatoração do Sistema FiapDelivery

## 📌 Sobre o Projeto

Este projeto tem como objetivo a refatoração de um sistema legado denominado **FiapDelivery**, conforme proposto na atividade prática.

O código original apresentava diversas falhas de engenharia de software, comprometendo sua segurança, escalabilidade e manutenção. A refatoração foi realizada aplicando conceitos fundamentais de **Programação Orientada a Objetos (POO)** e princípios de **Clean Code**.

---

## 🎯 Objetivo da Atividade

Diagnosticar e corrigir problemas estruturais no código legado, aplicando:

* Encapsulamento
* Herança
* Associação entre classes
* Uso adequado de construtores
* Boas práticas de Clean Code

---

## ❌ Problemas Identificados no Código Original

O sistema inicial apresentava:

* Atributos públicos (violação de encapsulamento)
* Nomes de variáveis não descritivos (`pl`, `cap`, `p1`, `c1`)
* Duplicação de código entre classes
* Associação rígida (Rota dependia apenas de Caminhão)
* Ausência de validações
* Falta de construtores
* Baixa legibilidade e organização

---

## ✅ Soluções Implementadas

### 🔒 Encapsulamento

Todos os atributos foram alterados para `private`, garantindo proteção dos dados e acesso controlado via métodos getters.

Exemplo:

```java
private String placa;
private double capacidadeKg;
```

---

### 🧬 Herança

Foi criada a classe abstrata `Veiculo`, centralizando atributos e comportamentos comuns.

```java
public abstract class Veiculo
```

As classes `Caminhao` e `Moto` passaram a herdar de `Veiculo`, eliminando duplicação de código.

---

### 🔗 Associação Flexível

A classe `Rota` foi refatorada para trabalhar com o tipo genérico `Veiculo`, permitindo o uso de diferentes meios de transporte.

```java
private Veiculo veiculo;
```

Isso torna o sistema mais escalável (ex: futuras classes como Drone, Bicicleta, etc.).

---

### 🏗️ Construtores

Todas as classes passaram a possuir construtores para garantir inicialização correta dos objetos.

Exemplo:

```java
public Caminhao(String placa, double capacidadeKg, int numeroDeEixos)
```

---

### ⚠️ Validações

Foram adicionadas validações para evitar estados inválidos no sistema.

```java
if (capacidadeKg <= 0) {
    throw new IllegalArgumentException("Capacidade deve ser positiva.");
}
```

---

### 🧹 Clean Code

* Nomes claros e descritivos
* Métodos com responsabilidade única
* Código organizado e legível
* Redução de duplicação
* Estrutura orientada a boas práticas

---

## 🏗️ Estrutura do Sistema

### 🔹 Veiculo (Classe Abstrata)

* placa
* capacidadeKg

---

### 🚛 Caminhao (Herança)

* numeroDeEixos

---

### 🏍️ Moto (Herança)

* possuiBau

---

### 📦 Pacote

* codigo
* pesoKg
* status
* método de atualização de status

---

### 🗺️ Rota (Associação)

Relaciona um pacote a um veículo, permitindo flexibilidade no transporte.

---

### ▶️ Principal

Responsável por executar o sistema e demonstrar o funcionamento com diferentes veículos.

---

## 🚀 Demonstração de Uso

```java
Caminhao caminhao = new Caminhao("ABC1234", 5000.0, 4);
Pacote pacote = new Pacote("BR999", 10.5, "Pendente");

Rota rota = new Rota(pacote, caminhao);
rota.iniciarEntrega();

// Uso com moto (polimorfismo)
Moto moto = new Moto("XYZ9876", 30.0, true);
Rota rotaMoto = new Rota(pacote, moto);
rotaMoto.iniciarEntrega();
```

---

## 🧠 Conceitos Aplicados

* Encapsulamento
* Herança
* Polimorfismo
* Associação
* Abstração
* Clean Code

---

## 📁 Entrega

* Código refatorado em Java
* Repositório no GitHub
* Diagrama UML exportado do Astah (PNG)

---

## 🏁 Conclusão

A refatoração transformou um sistema com falhas graves em uma solução estruturada, segura e escalável, alinhada às boas práticas de engenharia de software.

O uso correto de conceitos de POO permitiu aumentar significativamente a qualidade, reutilização e manutenção do código.

---

## 👨‍💻 Autor

Sergio Mirabelo
