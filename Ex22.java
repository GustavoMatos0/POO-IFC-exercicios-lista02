package lista2;

import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("informe um número inteiro: ");
        int n1 = in.nextInt();
        int n2 = n1;
        int uni = n1 % 10;
        n1 = (n1 - uni) / 10;
        int dez = n1 % 10;
        n1 = (n1 - dez) / 10;
        System.out.println(n2 + ": " + n1 + " centenas, " + dez + " dezenas, " + uni + " unidades");
        in.close();
    }

}
