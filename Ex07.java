package lista2;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe três números inteiros: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        if (n1 > n2 && n2 > n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        } else if (n1 > n3 && n3 > n2) {
            System.out.println(n1 + " " + n3 + " " + n2);
        } else if (n3 > n1 && n1 > n2) {
            System.out.println(n3 + " " + n1 + " " + n2);
        } else if (n3 > n2 && n2 > n1) {
            System.out.println(n3 + " " + n2 + " " + n1);
        } else if (n2 > n1 && n1 > n2) {
            System.out.println(n2 + " " + n1 + " " + n3);
        } else if (n2 > n3 && n3 > n1) {
            System.out.println(n2 + " " + n3 + " " + n1);
        } else if (n1 == n2 && n1 > n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        } else if (n1 == n2 && n1 < n3) {
            System.out.println(n3 + " " + n1 + " " + n2);
        } else if (n1 == n3 && n1 > n2) {
            System.out.println(n1 + " " + n3 + " " + n2);
        } else if (n1 == n3 && n1 < n2) {
            System.out.println(n2 + " " + n1 + " " + n3);
        } else if (n2 == n3 && n2 > n1) {
            System.out.println(n2 + " " + n3 + " " + n1);
        } else if (n2 == n3 && n2 < n1) {
            System.out.println(n1+" "+n2+" "+n3);
        }else{
            System.out.println(n1+" "+n2+" "+n3);  //caso n1, n2 e n3 serem iguais
        }
        in.close();
    }

}
