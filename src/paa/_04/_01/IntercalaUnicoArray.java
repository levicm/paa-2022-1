package paa._04._01;

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
        int atualAniche = 0;
        int atualAlberto = meio;

        while (atualAniche < meio && atualAlberto < alunos.length) {
            Aluno alunoAniche = alunos[atualAniche];
            Aluno alunoAlberto = alunos[atualAlberto];
            if (alunoAniche.getNota() < alunoAlberto.getNota()) {
                resultado[atual] = alunoAniche;
                atualAniche++;
            } else {
                resultado[atual] = alunoAlberto;
                atualAlberto++;
            }
            atual++;
        }
        while (atualAniche < meio) {
            resultado[atual] = alunos[atualAniche];
            atual++;
            atualAniche++;
        }
        while (atualAlberto < alunos.length) {
            resultado[atual] = alunos[atualAlberto];
            atual++;
            atualAlberto++;
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
