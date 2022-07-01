package paa._01._02;

public class EncontraMenorPreco {

    public static void main(String[] args) {
        Produto produtos[] = new Produto[] { new Produto("Lamborghini", 1000000), new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000), new Produto("Smart", 46000), new Produto("Fusca", 17000) };

        int menor = buscaMenor(produtos, 0, produtos.length);
        System.out.println("O mais barato foi " + produtos[menor]);
    }

    public static int buscaMenor(Produto[] produtos, int inicio, int fim) {
        int maisBarato = inicio;
        for (int atual = inicio; atual < fim; ++atual) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }

}
