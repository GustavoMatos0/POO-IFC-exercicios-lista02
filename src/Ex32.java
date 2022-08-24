package lista2;

import java.util.Scanner;

public class Ex32 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char q1 = 'a', q2 = 'a', q3 = 'b', q4 = 'b', q5 = 'c', q6 = 'c', q7 = 'd', q8 = 'd', q9 = 'e', q10 = 'e', r1, r2, r3, r4, r5, r6, r7, r8, r9, r10;
        int pont = 0;
        System.out.println("Questão 01:[a], [b], [c], [d]");
        r1 = in.nextLine().charAt(0);
        System.out.println("Questão 02:[a], [b], [c], [d]");
        r2 = in.nextLine().charAt(0);
        System.out.println("Questão 03:[a], [b], [c], [d]");
        r3 = in.nextLine().charAt(0);
        System.out.println("Questão 04:[a], [b], [c], [d]");
        r4 = in.nextLine().charAt(0);
        System.out.println("Questão 05:[a], [b], [c], [d]");
        r5 = in.nextLine().charAt(0);
        System.out.println("Questão 06:[a], [b], [c], [d]");
        r6 = in.nextLine().charAt(0);
        System.out.println("Questão 07:[a], [b], [c], [d]");
        r7 = in.nextLine().charAt(0);
        System.out.println("Questão 08:[a], [b], [c], [d]");
        r8 = in.nextLine().charAt(0);
        System.out.println("Questão 09:[a], [b], [c], [d]");
        r9 = in.nextLine().charAt(0);
        System.out.println("Questão 10:[a], [b], [c], [d]");
        r10 = in.nextLine().charAt(0);
        System.out.println("");
        System.out.println("----------Gabarito----------");
        System.out.println("");
        if (r1 == q1) {
            System.out.println("Q1: " + r1 + ": Correto");
            pont++;
        } else {
            System.out.println("Q1: " + r1 + ": Errada, resposta: " + q1);
        }
        if (r2 == q2) {
            System.out.println("Q2: " + r2 + ": Correto");
            pont++;
        } else {
            System.out.println("Q2: " + r2 + ": Errada, resposta: " + q2);
        }
        if (r3 == q3) {
            System.out.println("Q3: " + r3 + ": Correto");
            pont++;
        } else {
            System.out.println("Q3: " + r3 + ": Errada, resposta: " + q3);
        }
        if (r4 == q4) {
            System.out.println("Q4: " + r4 + ": Correto");
            pont++;
        } else {
            System.out.println("Q4: " + r4 + ": Errada, resposta: " + q4);
        }
        if (r5 == q5) {
            System.out.println("Q5: " + r5 + ": Correto");
            pont++;
        } else {
            System.out.println("Q5: " + r5 + ": Errada, resposta: " + q5);
        }
        if (r6 == q6) {
            System.out.println("Q6: " + r6 + ": Correto");
            pont++;
        } else {
            System.out.println("Q6: " + r6 + ": Errada, resposta: " + q6);
        }
        if (r7 == q7) {
            System.out.println("Q7: " + r7 + ": Correto");
            pont++;
        } else {
            System.out.println("Q7: " + r7 + ": Errada, resposta: " + q7);
        }
        if (r8 == q8) {
            System.out.println("Q8: " + r8 + ": Correto");
            pont++;
        } else {
            System.out.println("Q8: " + r8 + ": Errada, resposta: " + q8);
        }
        if (r9 == q9) {
            System.out.println("Q9: " + r9 + ": Correto");
            pont++;
        } else {
            System.out.println("Q9: " + r9 + ": Errada, resposta: " + q9);
        }
        if (r10 == q10) {
            System.out.println("Q10: " + r10 + ": Correto");
            pont++;
        } else {
            System.out.println("Q10: " + r10 + ": Errada, resposta: " + q10);
        }
        System.out.println("Pontuação final: " + pont);
        in.close();
    }

}
