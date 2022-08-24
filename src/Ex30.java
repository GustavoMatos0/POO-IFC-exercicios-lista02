package lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex30 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##,###.00");
        double precomor = 0, nprecomor = 0, precomac = 0, nprecomac = 0;
        System.out.println("Quantidade de morangos: (Kgs)");
        float mor = in.nextFloat();
        System.out.println("Quantidade maças: (Kgs)");
        float mac = in.nextFloat();
        if (mor <= 5) {
            nprecomor = mor * 2.5;
            precomor = mor * 2.5;
        } else {
            precomor = mor * 2.2;
            nprecomor = precomor - (precomor * 0.1);
        }
        if (mac <= 5) {
            nprecomac = mac * 1.8;
            precomac = mac * 1.8;
        } else {
            precomac = mac * 1.5;
            nprecomac = precomac - (precomac * 0.1);
        }
        if (precomor == nprecomor) {
            System.out.println("Preço Morango: " + df.format(precomor) + " R$");
        } else {
            System.out.println("Preço Morango: " + df.format(precomor) + " R$");
            System.out.println("Preço Morango 10% OFF: " + df.format(nprecomor) + " R$");
        }
        System.out.println("");
        if (precomac == nprecomac) {
            System.out.println("Preço Maça: " + df.format(precomac) + " R$");
        } else {
            System.out.println("Preco Maça: " + df.format(precomac) + " R$");
            System.out.println("Preço Maça 10% OFF: " + df.format(nprecomac) + " R$");
        }
        in.close();
    }

}
