package lista2;

import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe dia: ");
        int dia = in.nextInt();
        System.out.println("Informe o mês (número): ");
        int mes = in.nextInt();
        System.out.println("Informe o ano: ");
        int ano = in.nextInt();
        if (dia > 30 || dia < 1 || mes < 1 || mes > 12 || ano < 1900 || ano > 2022) {
            System.out.println("Data invalida");
        } else {
            System.out.println(dia + "/" + mes + "/" + ano);
        }
        in.close();
    }

}
