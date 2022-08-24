package lista2;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite dois números inteiros: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        if(n1>n2){
            System.out.println("Número maior: "+n1);
        }else{
            System.out.println("Número maior: "+n2);
        }
        in.close();
    }

}
