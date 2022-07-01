package paa._01._03;

public class OrdenaEncontraProdutos {

    public static void main(String[] args) {
        Produto produtos[] = new Produto[] { new Produto("Lamborghini", 1000000), new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000), new Produto("Smart", 46000), new Produto("Fusca", 17000) };
        imprimeProdutos(produtos);

        ordena(produtos);

        imprimeProdutos(produtos);

        int primeiraPosicao = 0;
        int ultimaPosicao = produtos.length - 1;
        System.out.println("O mais barato foi " + produtos[primeiraPosicao]);
        System.out.println("O mais caro foi " + produtos[ultimaPosicao]);
    }

    private static void imprimeProdutos(Produto[] produtos) {
        System.out.println("Produtos: [");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("  " + produtos[i] + ",");
        }
        System.out.println("]");
    }

    private static void ordena(Produto[] produtos) {
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Estou na casa " + i);
            int menor = buscaMenor(produtos, i, produtos.length);
            Produto menorProd = produtos[menor];
            System.out.println("Menor: " + menorProd);
            if (menor != i) {
                System.out.println("Trocando: " + menorProd + ". Por: " + produtos[i]);
                produtos[menor] = produtos[i];
                produtos[i] = menorProd;
            }
        }
    }

    public static int buscaMenor(Produto[] produtos, int inicio, int fim) {
        int maisBarato = inicio;
        for (int atual = inicio + 1; atual < fim; ++atual) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }

}
