package lista2;

import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor a ser sacado (entre 10R$ a 600R$): ");
        int valor = in.nextInt();
        if (valor < 10 || valor > 600) {
            System.out.println("Quantia invalida");
        } else {
            int cem = valor / 100;
            valor -= cem * 100;
            int cin = valor / 50;
            valor -= cin * 50;
            int dez = valor / 10;
            valor -= dez * 10;
            int cinco = valor / 5;
            valor -= cinco * 5;
            int um = valor;
            if(cem >0){
                System.out.println(cem+" nota(s) de cem");
            }
            if(cin>0){
                System.out.println(cin+" nota(s) de cinquenta");
            }
            if(dez>0){
                System.out.println(dez+" nota(s) de dez");
            }
            if(cinco>0){
                System.out.println(cinco+" nota(s) de cinco");
            }
            if(um>0){
                System.out.println(um+" nota(s) de um");
            }
            in.close();
        } 

    }

}
