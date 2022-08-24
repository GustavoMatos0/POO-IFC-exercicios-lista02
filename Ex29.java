package lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex29 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##,###.00");
        double preco = 0, npreco = 0;
        System.out.println("Quantidade de litros: ");
        float litro = in.nextFloat();
        in.nextLine();
        System.out.println("Tipo de combustível: [A]álcool, [G]gasolina");
        char com = in.nextLine().charAt(0);
        if (com == 'A') {
            preco = litro * 1.9;
            if (litro <= 20) {
                npreco = preco - (preco * 0.03);
            } else {
                npreco = preco - (preco * 0.05);
            }
        } else if (com == 'G') {
            preco = litro * 2.5;
            if (litro <= 20) {
                npreco = preco - (preco * 0.04);
            } else {
                npreco = preco - (preco * 0.06);
            }
        } else {
            System.out.println("Combustivél invalido");
        }
        System.out.println("Preço: " + df.format(preco) + " R$");
        System.out.println("Preço com desconto: " + df.format(npreco) + " R$");
        in.close();
    }

}
