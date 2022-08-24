package lista2;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Primeiro lado: ");
        float a = in.nextFloat();
        System.out.println("Segundo lado: ");
        float b = in.nextFloat();
        System.out.println("Terceiro lado: ");
        float c = in.nextFloat();
        if ((a + b < c) || (a + c < b) || (b + c < a)) {
            System.out.println("Não é um Triangulo");
        } else if ((a == b) && (a == c)) {
            System.out.println("Equilatero");
        } else if ((a == b) || (a == c) || (b == c)) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
        in.close();
    }

}
