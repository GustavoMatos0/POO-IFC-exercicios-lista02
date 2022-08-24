package lista2;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um letra: ");
        char l = in.nextLine().charAt(0);
        switch (l) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
        }
        in.close();
    }

}
