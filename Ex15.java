package lista2;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String or = "Importado";
        System.out.println("Informe valor do protudo R$:");
        float val = in.nextFloat();
        System.out.println("Digite o código de origem: ");
        int cod = in.nextInt();
        switch (cod) {
            case 1:
                or = "Sul";
                break;
            case 2:
                or = "Norte";
                break;
            case 3:
                or = "Leste";
                break;
            case 4:
                or = "Oeste";
                break;
            case 5:
            case 6:
                or = "Nordeste";
                break;
            case 7:
                or = "Centro-oeste";
                break;
        }
        System.out.println("Valor do produto: " + val + " R$");
        System.out.println("Origem: " + or);
        in.close();
    }

}
