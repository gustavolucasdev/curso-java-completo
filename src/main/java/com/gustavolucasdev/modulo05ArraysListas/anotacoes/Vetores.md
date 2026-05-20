📌 O que é um vetor?

Um vetor (array) é uma estrutura usada para armazenar vários valores do mesmo tipo dentro de uma única variável.

Imagine uma fileira de caixas na memória:

┌────┬────┬────┬────┬────┐
│ 10 │ 20 │ 30 │ 40 │ 50 │
└────┴────┴────┴────┴────┘
0    1    2    3    4

Cada posição possui um índice.

🎯 Por que usar vetores?

Sem vetores:

int n1 = 10;
int n2 = 20;
int n3 = 30;
int n4 = 40;
int n5 = 50;

Com vetor:

int[] numeros = new int[5];

✅ Mais organizado
✅ Mais profissional
✅ Mais fácil de repetir operações

🧱 Estrutura básica
tipo[] nome = new tipo[tamanho];
Exemplo
int[] numeros = new int[5];
Isso significa:
Parte	Explicação
int	Tipo dos dados
numeros	Nome do vetor
5	Quantidade de posições
🧠 Como o vetor funciona na memória

Quando fazemos:

int[] numeros = new int[5];

O Java cria:

Índice →   0    1    2    3    4
┌────┬────┬────┬────┬────┐
Valor →   │ 0  │ 0  │ 0  │ 0  │ 0  │
└────┴────┴────┴────┴────┘

⚠️ Valores padrão do int começam em 0.

🔢 Índices do vetor

O vetor sempre começa no índice 0.

Posição	Índice
Primeira	0
Segunda	1
Terceira	2
✍️ Adicionando valores
numeros[0] = 10;
numeros[1] = 20;
numeros[2] = 30;

Resultado:

Índice →   0    1    2    3    4
┌────┬────┬────┬────┬────┐
Valor →   │10  │20  │30  │ 0  │ 0  │
└────┴────┴────┴────┴────┘
👀 Acessando valores
System.out.println(numeros[0]);
Saída:
10
🔁 Percorrendo vetor com for

A maior vantagem dos vetores é usar repetição.

for (int i = 0; i < numeros.length; i++) {
System.out.println(numeros[i]);
}
🧩 Entendendo o for
📍 Começo
int i = 0;

Começa no índice 0.

📍 Condição
i < numeros.length

Repete enquanto i for menor que o tamanho do vetor.

📍 Incremento
i++

Aumenta 1 a cada repetição.

⭐ .length
numeros.length

Retorna o tamanho do vetor.

Exemplo
int[] numeros = new int[5];

System.out.println(numeros.length);
Saída
5

✅ Forma profissional
✅ Evita erros
✅ Código mais limpo

📥 Entrada de dados com vetor

Exemplo clássico:

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

double[] vect = new double[n];

for (int i = 0; i < n; i++) {
vect[i] = sc.nextDouble();
}
🔍 O que está acontecendo?
1️⃣ Lendo quantidade
int n = sc.nextInt();

Usuário digita:

3
2️⃣ Criando o vetor
double[] vect = new double[n];

Agora existem 3 posições.

3️⃣ Preenchendo o vetor
for (int i = 0; i < n; i++) {
vect[i] = sc.nextDouble();
}

Usuário digita:

5.0
7.0
9.0

Resultado:

┌─────┬─────┬─────┐
│ 5.0 │ 7.0 │ 9.0 │
└─────┴─────┴─────┘
⚠️ Erro muito comum
ArrayIndexOutOfBoundsException

Acontece quando tenta acessar uma posição inexistente.

❌ Exemplo errado:

int[] numeros = new int[3];

numeros[3] = 10;

O vetor possui apenas:

0, 1, 2
🧱 Vetores de objetos

Também podemos armazenar objetos:

Product[] vect = new Product[n];

Cada posição guarda um objeto Product.

Muito usado em sistemas reais.

✅ Exemplo completo
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
🧠 Mentalidade para entender vetores

Pense assim:

Vetor = várias posições na memória

E:

i = posição atual
📚 Resumo rápido
Conceito	Significado
Vetor	Estrutura que guarda vários valores
Índice	Posição do elemento
Primeiro índice	Sempre 0
.length	Tamanho do vetor
for	Percorre o vetor
Mesmo tipo	Todos os elementos precisam ter o mesmo tipo