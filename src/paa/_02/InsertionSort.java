package paa._02;

public class InsertionSort {

    public static void main(String[] args) {
        Produto produtos[] = new Produto[] { new Produto("Lamborghini", 1000000), new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000), new Produto("Smart", 46000), new Produto("Fusca", 17000) };
        Produto.imprimeProdutos(produtos);
        
        ordenaPorInsercao(produtos);

        Produto.imprimeProdutos(produtos);
    }

    private static void ordenaPorInsercao(Produto[] produtos) {
        for (int atual = 0; atual < produtos.length; atual++) {            
            int analise = atual;
            System.out.println("Atual: " + atual);
            while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
                System.out.println("Analise: " + analise);
                System.out.println("Trocando: " + produtos[analise] + ". Por: " + produtos[analise - 1]);
                Produto prodAnalise = produtos[analise];
                produtos[analise] = produtos[analise - 1];
                produtos[analise - 1] = prodAnalise;
                analise--;
            }
        }
        
    }

}
