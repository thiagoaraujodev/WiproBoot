<div style="display: inline_block" align="center">
  <br>
  <img align="center" alt="Logo Wipro" title="Wipro" height="200"  width="300" src="../../.github/wipro_logo.png">
  <img align="center" alt="Logo Gama Academy" title="Gama Academy" height="70" width="300" src="../../.github/gama_academy_logo.png">
</div>

<br>

<h1 align="center"> Wipro Bootcamp </h1>

<br>

## 📝 Programação Orientada a Objetos

A Programação Orientada a Objetos conhecida como POO, é onde o desenvolvedor tem de começar a pensar fora da caixa, a imaginar uma forma onde será preciso recorrer ao mundo real para o desenvolvimento das aplicações, pois hoje toda a programação em Java é orientada a objetos.

A programação orientada a objetos surgiu como uma alternativa a características da programação estruturada. O intuito da sua criação também foi o de aproximar o manuseio das estruturas de um programa ao manuseio das coisas do mundo real, daí o nome "objeto" como uma algo genérico, que pode representar qualquer coisa tangível.

Esse paradigma se baseia principalmente em dois conceitos chave: classes e objetos.


**Alan Curtis Kay** - Conhecido por ser um dos criadores da POO e da linguagem de programação Smalltalk.
É Graduado em matemática e biologia molecular pela Universidade do Colorado. Com seus conhecimentos em Biologia e Matemática, formulou sua "analogia algébrico-biológica" e lançou o postulado de que o computador ideal deveria: funcionar como um organismo vivo, isto é, cada "célula" iria se comportar relacionando-se com outras a fim de alcançar um objetivo, contudo, funcionando de forma autônoma. As células poderiam também reagrupar-se para resolver um outro problema ou desempenhar outras funções.

**O que é Objeto?**
São Coisas materiais ou abstratas que podem ser percebidas pelos sentidos e descritas por meio das suas características, comportamentos e estado atual, ou seja, é a instancia de uma classe.

**O que é Classe?**
Já a Classe é uma descrição que abstrai um conjunto de objetos com características similares. Define atributos e métodos comuns que serão compartilhados por um objeto.

Podemos exemplificar que:

- Coisas que eu tenho é um (Atributo)
- Coisas que eu faço é um (Metodo)
- Como estou atualmente é um (Estado)

Para obter esse entendimento, é necessário conhecer alguns dos pilares da Orientação a Objetos que são:

- Abstração
- Encapsulamento
- Herança
- Polimorfismo

## 📃 Abstração

Trata-se da capacidade de filtrar apenas os dados relevantes e necessários para criação do nosso objeto. Trazer o cenário real de modo simplificado e objetivo para sua aplicação/objeto. Tendo como consideração as suas características e ações.


## 📃 Encapsulamento

É a técnica utilizada para esconder uma ideia, ou seja, não expôr detalhes internos para o usuário, ocultando partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior. Encapsular não é obrigatório, mas é uma boa prática para produzir Classes mais eficientes. Objetos bem encapsulados produzem padrões e geram proteção aos seus produtos e aos seus usuários. É o contato com o mundo exterior, que define o que pode ser feito com um objeto dessa classe.


## 📃 Herança

Herança é a capacidade de uma subclasse ter acesso às propriedades da superclasse, a ela relacionada. Ela permite basear uma nova classe na definição de uma outra classe previamente existente.

**Tipos de herança:**

**Herança de implementação:** Utiliza características e comportamentos da superclasse ou das classes ancestrais, porém não implementa nenhum novo método.

**Herança para diferença:** Além de utilizar características e comportamentos da superclasse, implementa novos atributos e/ou procedimentos.

A palavra-chave **extends** em Java indica que a classe filha herda ou adquire as propriedades da classe pai. Esta palavra-chave basicamente estabelece uma relação de herança entre classes. Se uma classe estende outra classe, dizemos que ela adquiriu todas as propriedades e comportamento da classe pai. Usamos a palavra-chave extends em Java entre dois nomes de classe que queremos conectar no relacionamento de herança.

```
public class MinhaClasse extends OutraClasse {

}
```

## 📃 Polimorfismo

Polimorfismo pode ser definido como muitas formas de fazer alguma coisa. Ela permite que classes pertencentes a uma mesma linha de herança possuam comportamentos diferentes para o mesmo método. O polimorfismo em Java se manifesta apenas na chamada de métodos.

## 📃 Interfaces

Interface é um modelo, muito semelhante a classe Java, mas a única diferença é que possui métodos abstratos e constantes estáticas. A interface deve ser "implementada" (como herdada) por outra classe com a palavra- implements. O principal objetivo de uma interface é obter segurança, ocultando certos detalhes e exibindo apenas os detalhes importantes de um objeto.
 
1. As interfaces não podem ser usadas para criar objetos
2. Métodos de interface não possuem corpo
3. Os métodos de interface são por padrão abstract public
4. Uma interface não pode conter um construtor (já que não pode ser usada para criar objetos)


## Atividade em Grupo no dia 06/04/2022

[Resolução da Atividade](../aula_poo/exercicios/).

Realizado por:

🧑‍💻 Ilessa Lobo

🧑‍💻 Paulo Henrique

🧑‍💻 Pedro Chaves

🧑‍💻 Roberto Brito

🧑‍💻 Thiago Araujo

<br>

---

Todos os conceitos foram retirados do material de apoio da [Aula sobre Programação Orientada a Objetos](../aula_poo/aula/poo.pdf).