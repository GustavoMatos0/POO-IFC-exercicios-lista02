package lista2;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Altura (Mts): ");
        float al = in.nextFloat();
        System.out.println("Peso (Kgs): ");
        float peso = in.nextFloat();
        in.nextLine();
        System.out.println("Sexo (M)/(F): ");
        String sex = in.nextLine();
        if ("M".equals(sex)) {
            double pesoi = (72.7*al) - 44.7;
            System.out.println("Altura: "+al);
            System.out.println("Peso: "+peso);
            System.out.println("Peso Ideal: "+pesoi);
            if(peso>pesoi){
                System.out.println("Acima do peso");
            }else if(peso == pesoi){
                System.out.println("Peso Ideal");
            }else{
                System.out.println("Abaixo do Peso Ideal");
            }
        }else if("F".equals(sex)){
            double pesoi = (62.1*al) - 44.7;
            System.out.println("Altura: "+al);
            System.out.println("Peso: "+peso);
            System.out.println("Peso Ideal: "+pesoi);
            if(peso>pesoi){
                System.out.println("Acima do peso");
            }else if(peso == pesoi){
                System.out.println("Peso Ideal");
            }else{
                System.out.println("Abaixo do Peso Ideal");
            }
        }else{
            System.out.println("Sexo Invalido");
        }
        in.close();
    }
}
