package paa._03._02;

public class Intercala {

    public static void main(String[] args) {
        Aluno[] aniche = new Aluno[] { 
                new Aluno("André", 4), 
                new Aluno("Mariana", 5), 
                new Aluno("Carlos", 8.5f),
                new Aluno("Paulo", 9) };
        imprime(aniche);

        Aluno[] alberto = new Aluno[] { 
                new Aluno("Jonas", 3), 
                new Aluno("Juliana", 6.7f), 
                new Aluno("Gui", 7),
                new Aluno("Lúcia", 9.3f), 
                new Aluno("Ana", 10) };
        imprime(alberto);

        Aluno[] resultado = intercala(aniche, alberto);
        imprime(resultado);
    }

    private static Aluno[] intercala(Aluno[] aniche, Aluno[] alberto) {
        Aluno[] resultado = new Aluno[aniche.length + alberto.length];

        int atual = 0;
        int atualAniche = 0;
        int atualAlberto = 0;

        while (atualAniche < aniche.length && atualAlberto < alberto.length) {
            Aluno alunoAniche = aniche[atualAniche];
            Aluno alunoAlberto = alberto[atualAlberto];
            if (alunoAniche.getNota() < alunoAlberto.getNota()) {
                resultado[atual] = alunoAniche;
                atualAniche++;
            } else {
                resultado[atual] = alunoAlberto;
                atualAlberto++;
            }
            atual++;
        }
        while (atualAniche < aniche.length) {
            resultado[atual] = aniche[atualAniche];
            atual++;
            atualAniche++;
        }
        while (atualAlberto < alberto.length) {
            resultado[atual] = alberto[atualAlberto];
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
