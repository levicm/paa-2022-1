package paa._01._01;

public class EncontraMenorPreco {

    public static void main(String[] args) {
        double precos[] = new double[5];
        precos[0] = 1000000;
        precos[1] = 46000;
        precos[2] = 16000;
        precos[3] = 46000;
        precos[4] = 17000;
        int maisBarato = 0;
        
        for (int atual = 0; atual <= 4; ++atual) {
            if (precos[atual] < precos[maisBarato]) {
                maisBarato = atual;
            }
        }
        
        System.out.println("O mais barato foi " + precos[maisBarato]);
    }

}
