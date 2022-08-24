package lista2;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe três números inteiros:");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        if (n2 != n1 && n1 != n3 && n2 != n3) {
            if (n1 > n2 && n2 > n3) {
                System.out.println("Maior: " + n1);
                System.out.println("Menor: " + n3);
            } else if (n1 > n3 && n3 > n2) {
                System.out.println("Maior: " + n1);
                System.out.println("Menor: " + n3);
            }
            if (n2 > n1 && n1 > n3) {
                System.out.println("Maior: " + n2);
                System.out.println("Menor: " + n3);
            } else if (n2 > n3 && n3 > n1) {
                System.out.println("Maior: " + n2);
                System.out.println("Menor: " + n1);
            }
            if (n3 > n2 && n2 > n1) {
                System.out.println("Maior: " + n3);
                System.out.println("Menor: " + n1);
            } else if (n3 > n1 && n1 > n2) {
                System.out.println("Maior: " + n3);
                System.out.println("Menor: " + n2);
            }
        } else {
            System.out.println("Informe três valores diferentes");
        }
        in.close();
    }

}
