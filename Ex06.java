package lista2;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número:");
        int n1 = in.nextInt();
        if(n1%2 == 0){
            System.out.println("Número "+n1+" é par");
            n1++;
            System.out.println("Número "+n1+" agora é impar");
        }else{
            System.out.println("Número "+n1+" é impar");
            n1++;
            System.out.println("Número "+n1+" agora é par");
        }
        in.close();
    }

}
