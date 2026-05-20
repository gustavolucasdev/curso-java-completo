O que é um vetor?

Em Java, um vetor (array) é uma estrutura usada para armazenar vários valores do mesmo tipo dentro de uma única variável.

Imagine uma gaveta com vários espaços:

[0] [1] [2] [3] [4]

Cada espaço guarda um valor.

Por que usar vetores?

Sem vetor, para guardar 5 números você precisaria fazer:

int n1 = 10;
int n2 = 20;
int n3 = 30;
int n4 = 40;
int n5 = 50;

Com vetor:

int[] numeros = new int[5];

Muito mais organizado.

Estrutura básica
tipo[] nomeDoVetor = new tipo[tamanho];

Exemplo:

int[] numeros = new int[5];

Isso cria um vetor com:

tipo: int
nome: numeros
tamanho: 5
Como funciona na memória

Quando você cria:

int[] numeros = new int[5];

O Java cria 5 posições:

Índice:   0   1   2   3   4
Valor:   [ ] [ ] [ ] [ ] [ ]
Índices do vetor

O vetor SEMPRE começa no índice 0.

Posição	Índice
1ª	0
2ª	1
3ª	2
4ª	3
5ª	4
Guardando valores
numeros[0] = 10;
numeros[1] = 20;
numeros[2] = 30;

Resultado:

Índice:   0    1    2    3    4
Valor:   10   20   30   0    0
Mostrando valores
System.out.println(numeros[0]);

Saída:

10
Exemplo completo
public class Main {
public static void main(String[] args) {

        int[] numeros = new int[3];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
    }
}
Usando for com vetores

A principal vantagem dos vetores é usar repetição.

Exemplo:

for (int i = 0; i < 3; i++) {
System.out.println(numeros[i]);
}
Explicando o for
int i = 0;

Começa no índice 0.

i < 3

Vai repetir enquanto i for menor que 3.

i++

Aumenta 1 a cada repetição.

Forma correta usando .length

Em vez de colocar o número manualmente:

for (int i = 0; i < 3; i++)

Use:

for (int i = 0; i < numeros.length; i++)

Porque:

numeros.length

retorna o tamanho do vetor.

Isso deixa o código mais profissional e seguro.

Entrada de dados com vetor

Exemplo muito usado no curso do Nélio Alves:

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

double[] vect = new double[n];

for (int i = 0; i < n; i++) {
vect[i] = sc.nextDouble();
}
O que está acontecendo aqui?
1. Lendo quantos valores existirão
   int n = sc.nextInt();

Usuário digita:

3
2. Criando o vetor
   double[] vect = new double[n];

Agora o vetor possui 3 posições.

3. Preenchendo o vetor
   for (int i = 0; i < n; i++) {
   vect[i] = sc.nextDouble();
   }

Se o usuário digitar:

5.0
7.0
9.0

O vetor fica:

[5.0] [7.0] [9.0]
Vetores de objetos

Você também pode criar vetores de objetos.

Exemplo:

Product[] vect = new Product[n];

Cada posição guardará um objeto Product.

Muito usado em sistemas reais.

Erro muito comum: ArrayIndexOutOfBoundsException

Acontece quando tenta acessar posição inexistente.

Exemplo:

int[] numeros = new int[3];

numeros[3] = 10;

ERRO.

Porque o vetor vai apenas até:

0, 1, 2
Resumo rápido
Conceito	Explicação
Vetor	Estrutura que guarda vários valores
Índice	Posição do vetor
Primeiro índice	Sempre 0
.length	Tamanho do vetor
for	Percorre o vetor
Todos os elementos	Mesmo tipo
Exemplo final completo
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
Mentalidade importante para aprender vetores

Quando estiver estudando, pense assim:

Vetor = lista de posições na memória

E:

i = posição atual

Se entender isso, o restante começa a ficar muito mais fácil.