package lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##,###.00");
        System.out.println("Informe o salário para reajuste (R$):");
        float sal = in.nextFloat();
        double nsal, au;
        int per;
        if (sal <= 280) {
            au = sal * 02;
            nsal = sal + au;
            per = 20;
        } else if (sal > 280 && sal <= 700) {
            au = sal * 0.15;
            nsal = sal + au;
            per = 15;
        } else if (sal > 700 && sal <= 1500) {
            au = sal * 0.1;
            nsal = sal + au;
            per = 10;
        } else {
            au = sal * 0.05;
            nsal = sal + au;
            per = 5;
        }
        System.out.println("Salário anterior: " + df.format(sal) + "R$");
        System.out.println("Percentual de aumento aplicado: " + per + "%");
        System.out.println("Valor aumentado: " + df.format(au) + "R$");
        System.out.println("Novo Salário: " + df.format(nsal) + "R$");
        in.close();
    }

}
