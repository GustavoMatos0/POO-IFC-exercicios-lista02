package lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##,###.00");
        int pir;
        double ir, inss, dir, dsi, fgts, totdis, nsal;
        System.out.println("Informe valor da hora (R$):");
        float vh = in.nextFloat();
        System.out.println("Total de horas trabalhadas no mês:");
        float th = in.nextFloat();
        float sal = vh * th;
        if (sal <= 900) {
            ir = 0;
            pir = 0;
        } else if (sal > 900 && sal <= 1500) {
            ir = 0.05;
            pir = 5;
        } else if (sal > 1500 && sal <= 2500) {
            ir = 0.1;
            pir = 10;
        } else {
            ir = 0.2;
            pir = 20;
        }
        inss = sal * 0.1;
        dir = sal * ir;
        dsi = sal * 0.03;
        fgts = sal * 0.11;
        totdis = dsi + dir + inss;
        nsal = sal - totdis;
        System.out.println("Salário Bruto: (" + vh + "*" + th + ") : R$ " + df.format(sal));
        System.out.println("(-) IR (" + pir + "%): R$ " + df.format(dir));
        System.out.println("(-) INSS (10%): R$ " + df.format(inss));
        System.out.println("(-) FGTS (11%): R$ " + df.format(fgts));
        System.out.println("(-) Sindicato(3%): R$ " + df.format(dsi));
        System.out.println("Total de Descontos: R$ " + df.format(totdis));
        System.out.println("Salário Liquido: R$ " + df.format(nsal));
        in.close();
    }

}
