package lista2;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o sexo (F),(M):");
        String s = in.nextLine();
        if("M".equals(s)){
            System.out.println("Masculino");
        }else if("F".equals(s)){
            System.out.println("Feminino");
        }else{
            System.out.println("Invalido");
        }
        in.close();
    }

}
