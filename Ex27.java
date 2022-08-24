package lista2;

import java.util.Scanner;

public class Ex27 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float s = 0;
        System.out.println("Primeiro número: ");
        float n1 = in.nextFloat();
        System.out.println("Segundo número: ");
        float n2 = in.nextFloat();
        System.out.println("Qual operção deseja fazer entre " + n1 + " e " + n2 + " ? [1]Soma, [2]Multiplicação, [3]Divisão");
        int escolha = in.nextInt();
        switch (escolha) {
            case 1:
                s = n1 + n2;
                break;
            case 2:
                s = n1 * n2;
                break;
            case 3:
                s = n1 / n2;
                break;
            default:
                System.out.println("Opção invalida, Consideando valor ZERO");
        }
        if (s % 2 == 0) {
            System.out.println(s + " PAR");
        } else {
            System.out.println(s + " IMPAR");
        }
        if (s >= 0) {
            System.out.println(s + " Positivo");
        } else {
            System.out.println(s + " Negativo");
        }
        if (s % 1 == 0) {
            System.out.println(s + " Inteiro");
        } else {
            System.out.println(s + " Decimal");
        }
        in.close();
    }

}
