package com.ux.certification.treintaDiasXCodes;

import java.util.*;

public class Day1Solution{

    public static void main(String[] args) {

        // Variables dadas
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scanner = new Scanner(System.in);

        // Leer datos
        int intInput = scanner.nextInt();
        double doubleInput = scanner.nextDouble();
        scanner.nextLine(); // limpiar buffer
        String stringInput = scanner.nextLine();

        // Operaciones
        System.out.println(i + intInput);
        System.out.println(d + doubleInput);
        System.out.println(s + stringInput);

        scanner.close();
    }
}
