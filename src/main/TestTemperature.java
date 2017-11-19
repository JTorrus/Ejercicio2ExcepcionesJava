/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import exceptions.IllegalTemperatureException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javier_T
 */
public class TestTemperature {

    static Scanner sc = new Scanner(System.in);
    static private final double CONVERSION_VALUE = 273.15;
    static private final Temperature TEMP = new Temperature();

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        boolean exit = false;
        int option;

        do {
            System.out.println("---------- INTRODUCCIÓN TEMPERATURA ----------");
            System.out.println("1. Introducir Celsius");
            System.out.println("2. Introducir Kelvin");
            System.out.println("---------- CONVERSIÓN TEMPERATURA ----------");
            System.out.println("3. De Celsius a Kelvin");
            System.out.println("4. De Kelvin a Celsius");
            System.out.println("---------- MOSTRAR TEMPERATURA ----------");
            System.out.println("5. Mostrar Celsius");
            System.out.println("6. Mostrar Kelvin");
            System.out.println("7. Salir");
            try {
                System.out.print("Introduce una opción -> ");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        TEMP.setC(celsiusCreate());
                        break;
                    case 2:
                        TEMP.setK(kelvinCreate());
                        break;
                    case 3:
                        System.out.println("La conversión de " + TEMP.getC() + "ºC a Kelvin es " + (TEMP.getC() + CONVERSION_VALUE));
                        break;
                    case 4:
                        System.out.println("La conversión de " + TEMP.getK() + "ºK a Celsius es " + (TEMP.getK() - CONVERSION_VALUE));
                        break;
                    case 5:
                        System.out.println("Los grados actuales en Celsius son " + TEMP.getC());
                        break;
                    case 6:
                        System.out.println("Los grados actuales en Kelvin son " + TEMP.getK());
                        break;
                    case 7:
                        exit = true;
                        break;
                }
            } catch (IllegalTemperatureException e) {
                System.err.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("Introduce un valor válido.");
                sc.next();
            }
        } while (!exit);
    }

    public static double celsiusCreate() {
        double degrees = 0;
        boolean correct = false;

        while (!correct) {
            try {
                System.out.println("Introduce los grados en Celsius");
                degrees = sc.nextDouble();
                correct = true;
            } catch (InputMismatchException e) {
                System.err.println("Introduce un valor correcto.");
                sc.next();
            }
        }

        return degrees;
    }

    public static double kelvinCreate() {
        double degrees = 0;
        boolean correct = false;

        while (!correct) {
            try {
                System.out.println("Introduce los grados en Kelvin");
                degrees = sc.nextDouble();
                correct = true;
            } catch (InputMismatchException e) {
                System.err.println("Introduce un valor correcto.");
                sc.next();
            }
        }

        return degrees;
    }

}
