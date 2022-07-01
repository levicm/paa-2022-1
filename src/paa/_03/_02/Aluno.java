package paa._03._02;

public class Aluno {

    private String nome;
    private float nota;
    
    public Aluno(String nome, float nota) {
        super();
        this.nome = nome;
        this.nota = nota;
    }
    
    public String getNome() {
        return nome;
    }
    
    public float getNota() {
        return nota;
    }
    
    @Override
    public String toString() {
        return nome + "(" + nota + ")";
    }
}
