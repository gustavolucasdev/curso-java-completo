# 🚀 Vetores em Java

> Explicação simples e visual sobre vetores (`arrays`) em Java.

---

# 📌 O que é um vetor?

Um **vetor** (array) é uma estrutura usada para armazenar **vários valores do mesmo tipo** dentro de uma única variável.

Imagine uma fileira de caixas na memória:

```text
┌────┬────┬────┬────┬────┐
│ 10 │ 20 │ 30 │ 40 │ 50 │
└────┴────┴────┴────┴────┘
   0    1    2    3    4
```

Cada posição possui um **índice**.

---

# 🎯 Por que usar vetores?

Sem vetores:

```java
int n1 = 10;
int n2 = 20;
int n3 = 30;
int n4 = 40;
int n5 = 50;
```

Com vetor:

```java
int[] numeros = new int[5];
```

✅ Mais organizado  
✅ Mais profissional  
✅ Mais fácil de repetir operações

---

# 🧱 Estrutura básica

```java
tipo[] nome = new tipo[tamanho];
```

## Exemplo

```java
int[] numeros = new int[5];
```

---

# 🧠 Como o vetor funciona na memória

```java
int[] numeros = new int[5];
```

Resultado:

```text
Índice →   0    1    2    3    4

          ┌────┬────┬────┬────┬────┐
Valor →   │ 0  │ 0  │ 0  │ 0  │ 0  │
          └────┴────┴────┴────┴────┘
```

---

# 🔢 Índices do vetor

O vetor sempre começa no índice `0`.

| Posição | Índice |
|---|---|
| Primeira | `0` |
| Segunda | `1` |
| Terceira | `2` |

---

# ✍️ Adicionando valores

```java
numeros[0] = 10;
numeros[1] = 20;
numeros[2] = 30;
```

Resultado:

```text
Índice →   0    1    2    3    4

          ┌────┬────┬────┬────┬────┐
Valor →   │10  │20  │30  │ 0  │ 0  │
          └────┴────┴────┴────┴────┘
```

---

# 👀 Acessando valores

```java
System.out.println(numeros[0]);
```

Saída:

```text
10
```

---

# 🔁 Percorrendo vetor com `for`

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

---

# ⭐ `.length`

```java
numeros.length
```

Retorna o tamanho do vetor.

---

# 📥 Entrada de dados com vetor

```java
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

double[] vect = new double[n];

for (int i = 0; i < n; i++) {
    vect[i] = sc.nextDouble();
}
```

---

# ⚠️ Erro muito comum

## `ArrayIndexOutOfBoundsException`

```java
int[] numeros = new int[3];

numeros[3] = 10;
```

O vetor possui apenas:

```text
0, 1, 2
```

---

# 🧱 Vetores de objetos

```java
Product[] vect = new Product[n];
```

Cada posição guarda um objeto `Product`.

---

# ✅ Exemplo completo

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {

            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println();

        System.out.println("Números digitados:");

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        sc.close();
    }
}
```

---

# 🧠 Mentalidade para entender vetores

```text
Vetor = várias posições na memória
```

```text
i = posição atual
```

---

# 📚 Resumo rápido

| Conceito | Significado |
|---|---|
| Vetor | Estrutura que guarda vários valores |
| Índice | Posição do elemento |
| Primeiro índice | Sempre `0` |
| `.length` | Tamanho do vetor |
| `for` | Percorre o vetor |

---
