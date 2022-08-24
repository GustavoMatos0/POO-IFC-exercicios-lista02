package lista2;

import java.util.Scanner;

public class Ex25b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número inteiro");
        int n1 = in.nextInt();
        if(n1%2 ==0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
        in.close();
    }

}
