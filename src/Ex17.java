package lista2;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ac;
        System.out.println("Informe a primeira nota: ");
        float n1 = in.nextFloat();
        System.out.println("Informe a segunda nota: ");
        float n2 = in.nextFloat();
        float m = (n1 + n2) / 2;
        if (m < 4) {
            ac = 'E';
        }else if (m < 6){
            ac = 'D';
        }else if(m < 7.5){
            ac = 'C';
        }else if(m<9){
            ac = 'B';
        }else{
            ac = 'A';
        }
        switch(ac){
            case 'A':
            case 'B':
            case 'C':
                System.out.println("Nota "+m);
                System.out.println("Aproveitamento: "+ac);
                System.out.println("Aluno Aprovado");
                break;
            default:
                System.out.println("Nota "+m);
                System.out.println("Aproveitamento: "+ac);
                System.out.println("Aluno Reprovado");
                break;
        }
        in.close();
    }

}
