package lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex31 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double preco = 0, npreco = 0, desc = 0;
        String carne1 = "";
        DecimalFormat df = new DecimalFormat("##,###.00");
        System.out.println("Tipo de carne: [F]filé duplo, [A]alcatra, [P]picanha");
        char carne = in.nextLine().charAt(0);
        System.out.println("Quantidade em Kgs: ");
        float kilo = in.nextFloat();
        System.out.println("Compra sera feita no cartão Tabajara? [1]sim, [2]não");
        int compra = in.nextInt();
        switch (carne) {
            case 'F':
                if (kilo <= 5) {
                    preco = kilo * 4.9;
                } else {
                    preco = kilo * 5.8;
                }
                carne1 = "Filé Duplo";
                break;
            case 'A':
                if (kilo <= 5) {
                    preco = kilo * 5.9;
                } else {
                    preco = kilo * 6.8;
                }
                carne1 = "Alcatra";
                break;
            case 'P':
                if (kilo <= 5) {
                    preco = kilo * 6.9;
                } else {
                    preco = kilo * 7.8;
                }
                carne1 = "Picanha";
                break;
            default:
                System.out.println("Tipo de Carne Invalido");
        }
        if (compra == 1) {
            desc = (preco * 0.05);
            npreco = preco - desc;
        }
        System.out.println("Tipo de Carne: " + carne1);
        System.out.println("Quantidade: " + kilo + " Kgs");
        System.out.println("Preço Total: " + df.format(preco) + " R$");
        if (compra == 1) {
            System.out.println("Pagamento com Cartão Tabajara, 5% OFF: " + df.format(desc) + " R$");
            System.out.println("Preço Total com Desconto: " + df.format(npreco) + " R$");
        }
        in.close();
    }

}
