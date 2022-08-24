package lista2;

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número");
        float n1 = in.nextFloat();
        if(n1%1 ==0){
            System.out.println("Número inteiro");
        }else{
            System.out.println("Número decimal");
        }
        in.close();
    }

}
