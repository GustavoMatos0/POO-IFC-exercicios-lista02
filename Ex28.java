package lista2;

import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sim = 0, teste;
        System.out.println("Telefonou para a vitima? [1]Sim, [2]Não");
        teste = in.nextInt();
        if (teste == 1) {
            sim++;
        } else if (teste != 2) {
            System.out.println("Opção invalida");
        }
        System.out.println("Esteve no local do crime? [1]Sim, [2]Não");
        teste = in.nextInt();
        if (teste == 1) {
            sim++;
        } else if (teste != 2) {
            System.out.println("Opção invalida");
        }
        System.out.println("Mora perto da vítima? [1]Sim, [2]Não");
        teste = in.nextInt();
        if (teste == 1) {
            sim++;
        } else if (teste != 2) {
            System.out.println("Opção invalida");
        }
        System.out.println("Devia para a vítima? [1]Sim, [2]Não");
        teste = in.nextInt();
        if (teste == 1) {
            sim++;
        } else if (teste != 2) {
            System.out.println("Opção invalida");
        }
        System.out.println("Já trabalhou com a vítima? [1]Sim, [2]Não");
        teste = in.nextInt();
        if (teste == 1) {
            sim++;
        } else if (teste != 2) {
            System.out.println("Opção invalida");
        }
        if (sim == 2) {
            System.out.println("Suspeita");
        } else if (sim >= 3 && sim <= 4) {
            System.out.println("Cumplice");
        }else if(sim == 5){
            System.out.println("Assasino");
        }else{
            System.out.println("Inocente");
        }
        in.close();
    }

}
