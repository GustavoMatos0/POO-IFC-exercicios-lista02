package lista2;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o ano: ");
        int ano = in.nextInt();
        if (ano % 4 == 0) {
            System.out.println("Ano bissexto: " + ano);
        } else {
            System.out.println("Ano: " + ano);
        }
        in.close();
    }

}
