package paa._02;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String toString() {
        return nome + " (" + preco + ")";
    }

    public static void imprimeProdutos(Produto[] produtos) {
        System.out.println("Produtos: [");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("  " + produtos[i] + ",");
        }
        System.out.println("]");
    }

    public int compareTo(Produto o) {
        return Double.compare(preco, o.preco);
//        if (getPreco() < o.getPreco()) {
//            return -1;
//        } else if (getPreco() > o.getPreco()) {
//            return 1;
//        } else {
//            return 0;
//        }
    }

}
