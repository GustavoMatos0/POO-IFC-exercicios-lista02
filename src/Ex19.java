package lista2;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Coeficiente a:");
        int a = in.nextInt();
        if (a == 0) {
            System.out.println("Valor [a] == 0 , não é equação de segundo grau.");
        } else {
            System.out.println("Coeficiente b:");
            int b = in.nextInt();
            System.out.println("Coeficiente c:");
            int c = in.nextInt();
            float delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Delta menor que zero, nao possui Raiz");
            } else if (delta == 0) {
                float raiz = -b / (2 * a);
                System.out.println("Delta = 0 , Raiz = " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Raizes: " + raiz1 + " e " + raiz2);
            }
        }
        in.close();
    }

}
