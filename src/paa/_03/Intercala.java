package paa._03;

public class Intercala {

    public static void main(String[] args) {
        Aluno[] aniche = new Aluno[4];
        aniche[0] = new Aluno("André", 4);
        aniche[1] = new Aluno("Mariana", 5);
        aniche[2] = new Aluno("Carlos", 8.5f);
        aniche[3] = new Aluno("Paulo", 9);
        imprime(aniche);

        Aluno[] alberto = new Aluno[5];
        alberto[0] = new Aluno("Jonas", 3);
        alberto[1] = new Aluno("Juliana", 6.7f);
        alberto[2] = new Aluno("Gui", 7);
        alberto[3] = new Aluno("Lúcia", 9.3f);
        alberto[4] = new Aluno("Ana", 10);
        imprime(alberto);
        
        Aluno[] resultado = new Aluno[aniche.length + alberto.length]; 
        
        int atual = 0;
        int atualAniche = 0;
        int atualAlberto = 0;
        
        while (atualAniche < aniche.length && 
                atualAlberto < alberto.length) {
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
        imprime(resultado);
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
