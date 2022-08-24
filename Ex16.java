package lista2;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        float n1 = in.nextFloat();
        System.out.println("Informe a segunda nota: ");
        float n2 = in.nextFloat();
        float m = (n1 + n2) / 2;
        if (m < 3) {
            System.out.println("Nota: "+m);
            System.out.println("Aluno Reprovado");
        }else if (m < 7){
            System.out.println("Nota: "+m);
            System.out.println("Aluno em Recuperação");
        }else{
            System.out.println("Nota: "+m);
            System.out.println("Aluno Aprovado");
        }
        in.close();
    }

}
