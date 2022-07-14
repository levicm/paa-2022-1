package paa._06._01;

import paa._06.Aluno;

public class BuscaLinear {

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
        
        Aluno chave = new Aluno("Chave", 9.3f);
        int pos = busca(alunos, chave);
        System.out.println(instrucoes + " instruções executadas!");
        System.out.println(chave + " está no posição " + pos);

        chave = new Aluno("Chave", 5.5f);
        pos = busca(alunos, chave);
        System.out.println(instrucoes + " instruções executadas!");
        System.out.println(chave + " está no posição " + pos);

        if (pos > -1) {
            System.out.println(alunos[pos]);
        }
    }

    private static int busca(Aluno[] alunos, Aluno chave) {
        instrucoes = 0;
        for (int i = 0; i < alunos.length; i++) {
            instrucoes++;
            if (alunos[i].getNota() == chave.getNota()) {
                return i;
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

}
