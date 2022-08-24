package lista2;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual turno você estuda? [M]Matutino ,[V]Vespertino, [N]Noturno");
        char per = in.nextLine().charAt(0);
        switch (per){
            case 'M':
                System.out.println("Bom Dia");
                break;
            case 'V':
                System.out.println("Boa Tarde");
                break;
            case 'N':
                System.out.println("Bao Noite");
                break;
            default:
                System.out.println("Informe um caractere valido ([M],[V] ou [N])");
        }
        in.close();
    }

}
