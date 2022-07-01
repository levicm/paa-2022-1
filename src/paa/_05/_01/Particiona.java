package paa._05._01;

import paa._05.Aluno;

public class Particiona {

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
           new Aluno("Gui", 7)
        };
        
        imprime(alunos);
        particiona(alunos);
        imprime(alunos);
    }

    private static void particiona(Aluno[] alunos) {
        int inicio = 0;
        int fim = alunos.length;
        int menoresAteAgora = 0;
        int posPivo = fim - 1;
        Aluno pivo = alunos[posPivo];
        for (int i = inicio; i < fim; ++i) {
            if (alunos[i].getNota() < pivo.getNota()) {
                troca(alunos, i, menoresAteAgora);
                menoresAteAgora++;
            }
        }
        System.out.println("Menores que o pivô: " + menoresAteAgora);
        troca(alunos, posPivo, menoresAteAgora);
    }
    
    private static void troca(Object[] array, int p1, int p2) {
        Object temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
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
