package paa._06._03;

import paa._06.Aluno;

public class BuscaLinearOrdenada {
    static int instrucoes = 0;

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[] { 
                new Aluno("André", 4), 
                new Aluno("Carlos", 8.5f), 
                new Aluno("Ana", 10),
                new Aluno("Jonas", 3), 
                new Aluno("Juliana", 6.7f), 
                new Aluno("Julia", 9.3f), 
                new Aluno("Paulo", 9),
                new Aluno("Mariana", 5), 
                new Aluno("Gui", 7) };
        
        imprime(alunos);
        ordena(alunos, 0, alunos.length);
        imprime(alunos);
        
        Aluno chave = new Aluno("Chave", 5.5f);
        int pos = buscaOrdenada(alunos, chave);
        System.out.println(instrucoes + " instruções executadas!");
        System.out.println(chave + " está no posição " + pos);
        if (pos > -1) {
            System.out.println(alunos[pos]);
        }
    }

    private static int buscaOrdenada(Aluno[] alunos, Aluno chave) {
        instrucoes = 0;
        for (int i = 0; i < alunos.length; i++) {
            instrucoes++;
            if (alunos[i].getNota() == chave.getNota()) {
                return i;
            } else if (alunos[i].getNota() > chave.getNota()) {
                return -1;
            }
        }
        return -1;
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

    private static void ordena(Aluno[] alunos, int inicio, int fim) {
        int qtElementos = fim - inicio;
        if (qtElementos > 1) {
            int posPivo = particiona(alunos, inicio, fim);
            ordena(alunos, inicio, posPivo);
            ordena(alunos, posPivo + 1, fim);
        }
    }

    private static int particiona(Aluno[] alunos, int inicio, int fim) {
        int menoresAteAgora = 0;
        int posPivo = fim - 1;
        Aluno pivo = alunos[posPivo];
        for (int i = inicio; i < fim; ++i) {
            if (alunos[i].getNota() < pivo.getNota()) {
                troca(alunos, i, inicio + menoresAteAgora);
                menoresAteAgora++;
            }
        }
        troca(alunos, posPivo, inicio + menoresAteAgora);
        return inicio + menoresAteAgora;
    }

    private static void troca(Object[] array, int p1, int p2) {
        Object temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

}
