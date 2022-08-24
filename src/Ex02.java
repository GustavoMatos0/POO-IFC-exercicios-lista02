package lista2;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int n1 = in.nextInt();
        if(n1>0){
            System.out.println("Número positivo");
        }else if(n1<0){
            System.out.println("Número negativo");
        }else{
            System.out.println("Zero");
        }
        in.close();
    }

}
