package com.company;

public class Main {

    public static void main(String args[])
            throws java.io.IOException {

        char choice, ignore;

        do {
            System.out.printf("Informacja o składni instrukcji:\n");
            System.out.printf("1 if\n");
            System.out.printf("2 switch\n");
            System.out.printf("3 for\n");
            System.out.printf("6 while\n");
            System.out.printf("5 do-while\n");
            System.out.printf("6 break\n");
            System.out.printf("7 continue\n");
            System.out.printf("Wybirz numer instrukcji lub q aby zakończyć." + " ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }
            while (ignore != '\n');
        } while (choice < '1' | choice > '7' & choice !='q' & choice !='Q');

        switch (choice) {
            case '1':
                System.out.print("Instrukcja warunkowa if:\n\n");
                System.out.print("if (warunek) instrukcja;\n");
                System.out.print("else instrukcja;\n");
                break;
            case '2':
                System.out.print("Instrukcja wyboru switch: \n\n");
                System.out.print("switch (warunek) { \n");
                System.out.print("case stała:\n");
                System.out.print("sekwencja instrukcji;\n");
                System.out.print("break;\n");
                System.out.print("default:\n");
                System.out.print("sekwencja instrukcji;\n");
                break;
            case '3':
                System.out.print("Pętla for:\n\n");
                System.out.print("for(inicjalizacja; warunek; iteracja)\n");
                System.out.print("instrukcja;\n");
                break;
            case '4':
                System.out.print("Pętla while:\n\n");
                System.out.print("while(warunek) instrukcja;");
                break;
            case '5':
                System.out.print("Pętla do-while:\n\n");
                System.out.print("do {\n");
                System.out.print("instrukcja;\n");
                System.out.printf("} while (warunek);\n");
                break;
            case '6':
                System.out.print("Instrukcja break:\n\n");
                System.out.print("break; lub break etykieta;\n");
                break;
            case '7':
                System.out.print("Instrukcja continue:\n\n");
                System.out.print("continue; lub continue etykieta;\n");
                break;
        }
    }
}
