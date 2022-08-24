package lista2;

import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Idade do aluno A:");
        int idadea = in.nextInt();
        System.out.println("Idade do aluno B:");
        int idadeb = in.nextInt();
        System.out.println("Idade do aluno C:");
        int idadec = in.nextInt();
        float m = (idadea + idadeb + idadec) / 3;
        if (m < 25) {
            System.out.println("Turma Jovem");
        } else if (m <= 40) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }
        in.close();
    }

}
