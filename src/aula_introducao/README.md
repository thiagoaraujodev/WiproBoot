<div style="display: inline_block" align="center">
  <br>
  <img align="center" alt="Logo Wipro" title="Wipro" height="200"  width="300" src="../../.github/wipro_logo.png">
  <img align="center" alt="Logo Gama Academy" title="Gama Academy" height="70" width="300" src="../../.github/gama_academy_logo.png">
</div>

<br>

<h1 align="center"> Wipro Bootcamp </h1>

<br>

## 📝 Introdução a linguagem Java

A linguagem Java possui várias regras que devem ser seguidas para que um programa possa ser entendido e executado pela JVM. Uma dessas regras é a própria sintaxe da linguagem, que é derivada de linguagens como C e C++. Com o tempo você se acostuma com a sintaxe e logo será tão simples quanto escrever seu próprio nome!

A primeira coisa que devemos fazer é criar uma classe em Java, para podermos entender como estruturar todos os códigos a partir de sua criação.

```java
class MinhaClasse {

  //código a ser implementado

}
```


## 🖇️ Variáveis & Estruturas de Controles

Uma variável é uma estrutura que permite que os dados ou expressões sejam armazenados para processamento de informações durante a execução do programa. Essas variáveis devem ser declaradas antes que possam ser usadas. Declarar uma variável significa criá-la em algum ponto do programa. A linguagem Java é fortemente tipada. Isso significa que cada variável obrigatoriamente deve ter um tipo declarado quando criada.

**Sintaxe:** tipo identificador = valor;

**Categorias de variáveis: **

**Variáveis Locais**<br>
Podem ser utilizadas dentro do método onde foram declaradas, não sendo acessíveis de outros 
pontos do programa.

**Variáveis de Instância**<br>
Uma classe pode conter variáveis que são declaradas fora dos métodos, chamadas de Variáveis 
de Instância. Seus valores são específicos de cada instância e não são compartilhados entre as 
instâncias.

**Variáveis de Classe**<br>
Variáveis declaradas como estáticas são variáveis compartilhadas entre todos os objetos 
instanciados a partir de uma classe. Por isso, essas variáveis também são conhecidas como 
Variáveis de Classe.

**Tipos de variáveis:**<br>
Por padrão, as variáveis de instância de tipo primitivo que são as variáveis dos tipo, byte, char, short, int, long, float e double são inicializadas como 0 (zero), e as variáveis do tipo boolean são inicializadas como false. As variáveis de referência são inicializadas com o valor “null” (nulo).



## 📃 Estrutura de Controle

Na ciência da computação, uma estrutura de controle (ou fluxo de controle) refere-se à ordem na qual instruções, expressões e chamadas de função, são executadas ou avaliadas em um programa de computador sob programação imperativa ou funcional.

**Estrutura if**
Se a condição for verdadeira, o programa executa o bloco de instruções e contínua para a próxima instrução.

**Estrutura if / else**
Se a condição for verdadeira, o programa executa o bloco de instruções 1, e se for falsa executa o bloco de instruções 2, após isso ele continua para a próxima instrução.


## 📃 Operadores Aritméticos

Entre os principais operadores temos:

- Operador de adição (+)
- Operador de subtração (-)
- Operador de multiplicação (*)
- Operador de divisão (/)
- Operador de módulo ou resto da divisão (%)
- Operador de incremento (variavel++)
- Operador de decremento (variavel--)
- Operador de igualdade (==)
- Operador de diferente (!=)
- Operador de maior que (>)
- Operador de menor que (<) 
- Operador de maior ou igual que (>=)
- Operador de menor ou igual que (>) 

## 📃 Estrutura de repetição

Dentro da lógica de programação é uma estrutura que permite executar mais de uma vez o mesmo comando ou conjunto de comandos de acordo com uma condição até que uma condição seja satisfeita, ou seja, se uma instrução ou uma sequência de instruções recisa ser executada várias vezes, deve se utilizar uma estrutura de repetição.

Entre os tipos de estruturas de repetição temos:

**While**
Que repete sua condição enquanto uma expressão booleana for verdadeira.

```java
//Incremento de 0 a 9
int i = 0;
While(i <= 9){
  i = i+1;
  System.out.println(i);
}
```

**Do While**
Funciona no mesmo sentido do While sendo que sua única diferença é que o bloco de código será executado ao menos uma vez.

```java
int i = 0;
do{
  System.out.println(i);
  i++;
}
While(i <= 10);
```

**For**
Faz uma repetião diante do controle do fluxo

```java
for(int i = 0; i < 5; i++){
  if(i % 2 == 0){
	System.out.println(i);
  }
}
While(i <= 10);
```

**For Each**
Projetado especificamente para iterar sobre matrizes e coleções de objetos.
 
```java
Sting[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

for(String i : cars){
  System.out.println(i);
}
```
 
 

## Atividade em Grupo no dia 01/04/2022

[Resolução da Atividade](../aula_introducao/exercicios).

🧑‍💻 Realizado pelo grupo 03.<br>
Obs.: não lembro do nome de todos e não quero ser injusto se esquecer de algum nome, por isso não informei o nome de todos.
 

## Desafio em Grupo no dia 02/04/2022

[Resolução do Desafio Versão Grupo](../aula_introducao/desafio/Shop_Versao_Grupo.java).

Realizado por:

🧑‍💻 Isaque Silva

🧑‍💻 Murilo Fernandes

🧑‍💻 Pedro Duarte

🧑‍💻 Renan Santos

🧑‍💻 Thiago Araujo

[Resolução do Desafio Versão Solo](../aula_introducao/desafio/Shop_Versao_Solo.java).

Implementei uma versão para desenvolver a prática na linguagem Java.


<br>

---

Todos os conceitos foram retirados do material de apoio da [Aula sobre Variáveis & Estruturas de Controles](../aula_introducao/aula/Estruturas%20de%20Controle.pdf).