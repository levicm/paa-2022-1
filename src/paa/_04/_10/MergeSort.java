package paa._04._10;

import paa._04.Aluno;

public class MergeSort {

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[] { 
                new Aluno("Andr?", 4), 
                new Aluno("Carlos", 8.5f),
                new Aluno("Ana", 10),
                new Aluno("Jonas", 3), 
                new Aluno("Juliana", 6.7f), 
                new Aluno("Gui", 7),
                new Aluno("Paulo", 9),
                new Aluno("Mariana", 5), 
                new Aluno("L?cia", 9.3f) };
        imprime(alunos);
        
        ordena(alunos, 0, alunos.length);

        imprime(alunos);
    }
    
    private static void ordena(Aluno[] alunos, int inicio, int fim) {
        int meio = (inicio + fim) / 2;
        System.out.println(inicio + " " + meio + " " + fim);
        if ((fim - inicio) > 2) {
            ordena(alunos, inicio, meio);
            ordena(alunos, meio, fim);
        }
        intercala(alunos, inicio, meio, fim);
    }

    private static void intercala(Aluno[] alunos, int inicio, int meio, int fim) {
        Aluno[] resultado = new Aluno[fim - inicio];

        int atual = 0;
        int atualEsquerda = inicio;
        int atualDireita = meio;

        while (atualEsquerda < meio && atualDireita < fim) {
            Aluno alunosEsquerda = alunos[atualEsquerda];
            Aluno alunosDireita = alunos[atualDireita];
            if (alunosEsquerda.getNota() < alunosDireita.getNota()) {
                resultado[atual] = alunosEsquerda;
                atualEsquerda++;
            } else {
                resultado[atual] = alunosDireita;
                atualDireita++;
            }
            atual++;
        }
        while (atualEsquerda < meio) {
            resultado[atual] = alunos[atualEsquerda];
            atual++;
            atualEsquerda++;
        }
        while (atualDireita < fim) {
            resultado[atual] = alunos[atualDireita];
            atual++;
            atualDireita++;
        }
        // Copiar o resultado de volta para o array original
        for (int i = 0; i < resultado.length; ++i) {
            alunos[inicio + i] = resultado[i];
        }
    }

    public static void imprime(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

}
