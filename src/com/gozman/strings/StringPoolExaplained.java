package com.gozman.strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringPoolExaplained {


    public static void main(String[] args) throws FileNotFoundException {

        /*
         *  intrucat stringurile sunt des utilizate in java  memoria alocata  catre ele sunt salvate intr-o zona speciala de memorie
         *  numita heap memory => https://www.journaldev.com/797/what-is-java-string-pool
         *  cand creez 2 referinte de tip String cu aceeasi valoare voi avea 2 referinte ce pointeaza catre aceeasi zona de memori
         */
        String s1 = "string-constant";
        String s2 = "string-constant";

        //new in schimb aloca o zona noua de memorie, chiar daca contine aceeasi valoare
        String s3 = new String("string-constant");

        Scanner scanner = new Scanner(new File("date.txt"));

        //citirea din fisier produce un nou string in memorie de asemenea
        String s4 = scanner.next();


        //dovezile mai jos
        System.out.println(  (s3 == s4)+"-"+ (s3.equals(s4)));
        System.out.println(  (s1 == s2)+"-"+(s1.equals(s2)));
        System.out.println(  (s2 == s3)+"-"+ (s2.equals(s3)));
        System.out.println(  (s1 == s4)+"-"+ (s1.equals(s4)));

        //CONCLUZIE : TOT TIMPUL FOLOSITI EQUALS PT COMPARAREA STRINGURILOR

    }
}
