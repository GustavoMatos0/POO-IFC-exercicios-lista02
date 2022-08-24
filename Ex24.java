package lista2;

import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Primeira nota:");
        int n1 = in.nextInt();
        System.out.println("Segunda nota:");
        int n2 = in.nextInt();
        System.out.println("Terceira nota");
        int n3 = in.nextInt();
        float m = (n1+n2+n3)/3;
        if(m<7){
            System.out.println("Média: "+m);
            System.out.println("Reprovado");
        }else if(m>=7 && m<10){
            System.out.println("Média: "+m);
            System.out.println("Aprovado");
        }else if(m == 10){
            System.out.println("Média: "+m);
            System.out.println("Aprovado com Distinção");
        }else{
            System.out.println("Média invalida, verifique as notas.");
        }
        in.close();
    }

}
