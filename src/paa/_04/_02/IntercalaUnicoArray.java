package paa._04._02;

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

        Aluno[] resultado = intercala(alunos, 4);
        imprime(resultado);
    }

    private static Aluno[] intercala(Aluno[] alunos, int meio) {
        Aluno[] resultado = new Aluno[alunos.length];

        int atual = 0;
        int atualEsquerda = 0;
        int atualDireita = meio;

        while (atualEsquerda < meio && atualDireita < alunos.length) {
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
        while (atualDireita < alunos.length) {
            resultado[atual] = alunos[atualDireita];
            atual++;
            atualDireita++;
        }
        return resultado;
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
