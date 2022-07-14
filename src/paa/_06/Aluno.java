package paa._06;

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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj instanceof Aluno) {
                Aluno aluno = (Aluno) obj;
                if (getNota() == aluno.getNota()) {
                    return true;
                }
            }
        }
        return false;
    }
}
