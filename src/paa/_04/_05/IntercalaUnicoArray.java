package paa._04._05;

import paa._04.Aluno;

public class IntercalaUnicoArray {

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[] { 
                new Aluno("André", 4), 
                new Aluno("Mariana", 5), 
                new Aluno("Carlos", 8.5f),
                new Aluno("Paulo", 9),
                new Aluno("Jonas", 3), 
                new Aluno("Juliana", 6.7f), 
                new Aluno("Gui", 7),
                new Aluno("Lúcia", 9.3f), 
                new Aluno("Ana", 10) };
        imprime(alunos);
        
        // Deixando de fora o início e o fim
        intercala(alunos, 1, 4, 6);
        
        imprime(alunos);
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
