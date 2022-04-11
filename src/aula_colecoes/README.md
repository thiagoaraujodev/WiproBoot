<div style="display: inline_block" align="center">
  <br>
  <img align="center" alt="Logo Wipro" title="Wipro" height="200"  width="300" src="../../.github/wipro_logo.png">
  <img align="center" alt="Logo Gama Academy" title="Gama Academy" height="70" width="300" src="../../.github/gama_academy_logo.png">
</div>

<br>

<h1 align="center"> Wipro Bootcamp </h1>

<br>

## 📝 Coleções

A estrutura de coleções Java é um conjunto de classes e interfaces que implementam estruturas de dados de coleção comumente reutilizáveis. Embora referido como uma estrutura, ele funciona como uma biblioteca. A estrutura de coleções fornece as duas interfaces que definem várias coleções e classes que as implementam.

**Classes empacotadoras de tipo**

**Wrappers**

Todo tipo primitivo tem uma classe empacotadora de tipo correspondente (no pacote java.lang).<br>
Essas classes chamam-se **Boolean, Byte, Character, Double, Float, Integer, Long e Short.**

Elas permitem manipular valores de tipo primitivo como objetos. Isso é importante porque as estruturas de dados Set, Queue e List (e suas classes derivadas) manipulam e compartilham objetos elas não podem manipular variáveis de tipos primitivos. Mas podem manipular objetos das classes empacotadoras de tipo(Wrappers), porque cada classe em última análise deriva de Object.


**Autoboxing e auto-unboxing**

O boxing converte um valor primitivo em um objeto da classe empacotadora de tipo correspondente. O unboxing converte um objeto empacotador de tipo no valor primitivo correspondente.

• O Java executa automaticamente conversão boxing e unboxing.

**Equals**

O método equals é utilizado para comparações. Classes por referência sobrescrevem equals() para garantir que dois objetos analisados, com o mesmo conteúdo, possam ser considerados iguais. E,
quando a classe a qual os objetos em questão pertencem não sobrescreve o método Equals(), o método Object.Equals() será chamado.<br>
Quando comparamos objetos, é considerada uma boa prática utilizarmos o método Equals() para fazer a comparação de igualdade.

**Collections**

A Java API fornece várias estruturas de dados pré definidas, chamadas coleções, usadas para armazenar grupos de objetos relacionados na memória.<br>
Essas classes fornecem métodos eficientes que organizam, armazenam e recuperam seus dados sem a necessidade de conhecer como os dados são armazenados. Isso reduz o tempo de desenvolvimento de aplicativos.

**SET**

Entre as principais caracteristicas do Set temos:

- Velocidade na pesquisa de dados, sendo mais rápida que um objeto do tipo List;
- A inserção de dados é mais lenta;
- Permite trabalhar com conjuntos e pode ser implementado como instâncias das classes HashSet ou TreeSet;
- Não precisa especificar a posição para adicionar um elemento;
- Não aceita valores duplicados. Se caso inserir um registro que já tenha no Set não será adicionado;
- Podem ser implementados como instâncias das classes HashSet ou TreeSet;


Quando está construindo objetos na classe Set é necessário informar que tipo de coleção será implementada.

**Sintaxe:** 

```
Set set = new Type();
```

**Set** - é o objeto declarado, podendo ser classes Wrappers ou tipo de coleção.<br>
**Type** - é o tipo de objeto da coleção a ser usado;


- Não ordenado (por padrão)
- Não indexado
- Não aceita obj. duplicados
- Pode ser heterogêneo
- Pode Ser homogêneo

**LIST**

Uma coleção ordenada (também conhecida como sequência ). O usuário desta interface tem controle preciso sobre onde na lista cada elemento é inserido. O usuário pode acessar os elementos por seu índice inteiro (posição na lista) e pesquisar os elementos na lista.

A interface List coloca estipulações adicionais, além das especificadas na interface Collection, nos contratos dos métodos iterador, add, remove, equals e hashCode.

- Ordenada
- Indexada
- Aceita obj. duplicados
- Pode ser heterogêneo
- Pode Ser Homogêneo

**Declaração - List**

```
ArrayList<Usuario> lista = new ArrayList<>();
```

**QUEUE(Fila)**

A interface Java Queue ordena o elemento de maneira FIFO (First In First Out). No FIFO, o primeiro elemento é removido primeiro e o último elemento é removido por último.

Lembre-se de que uma fila é uma coleção que representa uma fila de espera — normalmente, inserções são feitas na parte de trás de uma fila e exclusões são feitas a partir da frente.

- Implementa fila
- Fist in/ Fist out(FIFO)

**Declaração - Queue**

```
Queue<String> fila = new LinkedList<>();
```

**MAP**

Mapeia chaves para valores. Cada elemento tem na verdade dois objetos: uma chave e um valor. Valores podem ser duplicados, mas chaves não. SortedMap é uma interface que estende Map, e permite classificação ascendente das chaves. As chaves em um Map devem ser únicas, mas os valores associados não precisam ser.

Três das várias classes que implementam a interface Map são Hashtable, HashMap e TreeMap. Hashtables e HashMaps armazenam elementos em tabelas de hash e TreeMaps armazenam elementos em árvores.

- Chave/Valor
- Chave não aceita repetição Valor aceita 
- Repetição

**Declaração - Map**

```
// cria HashMap para armazenar chaves de Strings e valores Integer 
Map<String, Integer> mapa = new HashMap<>();
```

**STACK(Pilha)**

Implementa pilha(stack) 
Last in/ Fist out(LIFO)

Interface | Descrição 
:--- | :---
Collection | A interface-raiz na hierarquia de coleções a partir da qual as interfaces Set, Queue e List são derivadas. 
Set | Uma coleção que não contém duplicatas.
List | Uma coleção ordenada que pode conter elementos duplicados.
Queue(Fila) | Em geral, uma coleção primeiro a entrar, primeiro a sair que modela uma fila de espera; outras ordens podem ser especificadas.
Map | Uma coleção que associa chaves a valores e que não pode conter chaves duplicadas. Map não deriva de Collection.

**Escolhendo uma coleção**

A documentação para cada coleção discute os requisitos de memória e as características de desempenho dos métodos para operações como adição e remoção de elementos, pesquisa de elementos, classificação de elementos etc.

Antes de escolher uma coleção, revise a documentação on-line para a categoria da coleção que você está considerando (Set, List, Map, Queue etc.), então selecione a implementação que melhor atende às
necessidades de seu aplicativo.
 
[Documentação](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html) (acesso em 04/2022)


<br>

---

Todos os conceitos foram retirados do material de apoio da [Aula sobre Coleções](../aula_colecoes/Colecoes.pdf).