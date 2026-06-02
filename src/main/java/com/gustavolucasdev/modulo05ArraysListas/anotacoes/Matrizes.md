# 📚 Matrizes em Java

---

# 🎯 O que é uma Matriz?

Uma **matriz** é uma estrutura de dados bidimensional, composta por **linhas** e **colunas**.

Em Java, uma matriz é um **array de arrays**.

### Exemplo visual

| 📍      | Coluna 0 | Coluna 1 | Coluna 2 |
| ------- | -------- | -------- | -------- |
| Linha 0 | 10       | 20       | 30       |
| Linha 1 | 40       | 50       | 60       |
| Linha 2 | 70       | 80       | 90       |

Cada elemento possui uma posição:

```java
matriz[linha][coluna]
```

Exemplo:

```java
matriz[1][2]
```

Resultado:

```text
60
```

---

# 🛠️ Declarando uma Matriz

```java
int[][] matriz;
```

Neste momento apenas declaramos a variável.

---

# 🚀 Instanciando uma Matriz

Criando uma matriz com 3 linhas e 4 colunas:

```java
int[][] matriz = new int[3][4];
```

Representação:

```text
[0][0] [0][1] [0][2] [0][3]
[1][0] [1][1] [1][2] [1][3]
[2][0] [2][1] [2][2] [2][3]
```

Como o tipo é `int`, todos os valores começam com:

```java
0
```

---

# ✍️ Atribuindo Valores

```java
int[][] matriz = new int[3][3];

matriz[0][0] = 10;
matriz[0][1] = 20;
matriz[0][2] = 30;

matriz[1][0] = 40;
matriz[1][1] = 50;
matriz[1][2] = 60;
```

---

# 🔍 Lendo um Elemento

```java
System.out.println(matriz[1][1]);
```

Saída:

```text
50
```

---

# 🔄 Percorrendo uma Matriz

A forma mais utilizada é com dois laços `for`.

```java
for (int i = 0; i < matriz.length; i++) {

    for (int j = 0; j < matriz[i].length; j++) {

        System.out.print(matriz[i][j] + " ");
    }

    System.out.println();
}
```

### 🧠 Lembre-se

| Código             | Significado           |
| ------------------ | --------------------- |
| `matriz.length`    | Quantidade de linhas  |
| `matriz[i].length` | Quantidade de colunas |

---

# 💻 Exemplo Completo

```java
public class Main {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }
}
```

### 📤 Saída

```text
1 2 3
4 5 6
7 8 9
```

---

# ⌨️ Entrada de Dados com Scanner

Muito comum nos exercícios do Nélio Alves.

```java
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

int[][] matriz = new int[n][n];

for (int i = 0; i < matriz.length; i++) {

    for (int j = 0; j < matriz[i].length; j++) {

        matriz[i][j] = sc.nextInt();
    }
}
```

Entrada:

```text
1 2 3
4 5 6
7 8 9
```

---

# ⭐ Exercício Clássico: Diagonal Principal

## Objetivo

Mostrar:

✅ Diagonal principal

✅ Quantidade de números negativos

---

### Exemplo

```text
5 -3 10
15 8 2
7 1 -5
```

### Diagonal principal

```text
5 8 -5
```

### Quantidade de negativos

```text
2
```

---

## Resolução

```java
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

int[][] mat = new int[n][n];

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        mat[i][j] = sc.nextInt();
    }
}

System.out.println("Diagonal principal:");

for (int i = 0; i < n; i++) {
    System.out.print(mat[i][i] + " ");
}

System.out.println();

int negativos = 0;

for (int i = 0; i < n; i++) {

    for (int j = 0; j < n; j++) {

        if (mat[i][j] < 0) {
            negativos++;
        }
    }
}

System.out.println("Negativos = " + negativos);
```

---

# 🧭 Exercício Clássico: Vizinhos de um Elemento

Matriz:

```text
10 8 15
12 21 11
23 8 14
```

Procurando:

```text
21
```

Resultado:

```text
Left: 12
Right: 11
Up: 8
Down: 8
```

---

## Código

```java
if (j > 0) {
    System.out.println("Left: " + mat[i][j - 1]);
}

if (j < mat[i].length - 1) {
    System.out.println("Right: " + mat[i][j + 1]);
}

if (i > 0) {
    System.out.println("Up: " + mat[i - 1][j]);
}

if (i < mat.length - 1) {
    System.out.println("Down: " + mat[i + 1][j]);
}
```

---

# 🔀 Matrizes Irregulares (Jagged Arrays)

Nem todas as linhas precisam ter o mesmo tamanho.

```java
int[][] matriz = new int[3][];

matriz[0] = new int[2];
matriz[1] = new int[5];
matriz[2] = new int[3];
```

Visualmente:

```text
Linha 0 → 2 colunas
Linha 1 → 5 colunas
Linha 2 → 3 colunas
```

---

# 🎓 Dicas para Provas

## 📌 Decorar

Quantidade de linhas:

```java
matriz.length
```

Quantidade de colunas:

```java
matriz[i].length
```

---

## 📌 Estrutura padrão

```java
for (int i = 0; i < matriz.length; i++) {

    for (int j = 0; j < matriz[i].length; j++) {

        // processar elemento
    }
}
```

---

## 📌 Acesso a um elemento

```java
matriz[i][j]
```

---

# 📝 Resumo Final

### Criar matriz

```java
int[][] matriz = new int[3][4];
```

### Linhas

```java
matriz.length
```

### Colunas

```java
matriz[i].length
```

### Elemento

```java
matriz[i][j]
```

### Percorrer

```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        // código
    }
}
```

---

# 🚀 Macete para lembrar

Pense na matriz como um prédio:

🏢 **Linha = Andar**

🚪 **Coluna = Apartamento**

Então:

```java
matriz[2][1]
```

Significa:

> Apartamento 1 do andar 2.

Essa analogia ajuda bastante a visualizar o acesso aos elementos durante os exercícios.
