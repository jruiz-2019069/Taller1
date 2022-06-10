package org.joseruiz.system;

import java.util.Scanner;

/*
     -Programador: Jose Gerardo Ruiz García
     -Carnet: 2019069
     -Creación: 24-03-2021
        -Modificaciones:
            Realización del menu completo: 24-03-2021.
            Cambio de tipo de bucle de While a Do while: 25-03-2021.
 */
public class Menu {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        int contador = 0;

        Menu();

        int opcion = entrada.nextInt();

        do {
            switch (opcion) {
                case 1: {

                    int hora = 0,
                            minutos = 0,
                            segundos = -1;

                    System.out.println("Ingrese la cantidad de segundos que desea convertir.");

                    entrada = new Scanner(System.in);

                    int valor = entrada.nextInt();

                    while ((segundos == -1) && (valor >= 0)) {
                        if (valor >= 3600) {
                            hora = valor / 3600;
                            valor = valor - (hora * 3600);
                        } else if (valor >= 60) {
                            minutos = valor / 60;

                            valor = valor - (minutos * 60);
                        } else if (valor < 60) {
                            segundos = valor;
                        }
                    }

                    System.out.println(hora + " : " + minutos + " : " + segundos);

                    Menu();

                    opcion = entrada.nextInt();
                }

                break;
                case 2: {

                    int doscientos = 0,
                            cien = 0,
                            cincuenta = 0,
                            veinte = 0,
                            diez = 0,
                            cinco = 0,
                            uno = 0;

                    System.out.println("Ingrese la cantidad a convertir a billetes.");

                    int cantidad = entrada.nextInt();

                    if (cantidad >= 200) {
                        doscientos = (cantidad / 200);

                        cantidad = cantidad - (doscientos * 200);
                    }
                    if (cantidad >= 100) {
                        cien = (cantidad / 100);

                        cantidad = cantidad - (cien * 100);
                    }
                    if (cantidad >= 50) {
                        cincuenta = (cantidad / 50);

                        cantidad = cantidad - (cincuenta * 50);
                    }
                    if (cantidad >= 20) {
                        veinte = (cantidad / 20);

                        cantidad = cantidad - (veinte * 20);
                    }
                    if (cantidad >= 10) {
                        diez = (cantidad / 10);

                        cantidad = cantidad - (diez * 10);
                    }
                    if (cantidad >= 5) {
                        cinco = (cantidad / 5);

                        cantidad = cantidad - (cinco * 5);
                    }
                    if (cantidad >= 1) {
                        uno = (cantidad / 1);

                        cantidad = cantidad - (uno * 1);
                    }

                    System.out.println("Hay " + doscientos + " billestes de Q.200.00");
                    System.out.println("Hay " + cien + " billestes de Q.100.00");
                    System.out.println("Hay " + cincuenta + " billestes de Q.50.00");
                    System.out.println("Hay " + veinte + " billestes de Q.20.00");
                    System.out.println("Hay " + diez + " billestes de Q.10.00");
                    System.out.println("Hay " + cinco + " billestes de Q.5.00");
                    System.out.println("Hay " + uno + " billestes de Q.1.00");

                    Menu();

                    opcion = entrada.nextInt();
                }

                break;
                case 3: {

                    System.out.println("Ingrese el numero que desea saber si es par o impar");

                    int num = entrada.nextInt();

                    if ((num % 2) == 0) {
                        System.out.println("El numero " + num + " es un numero par.");
                    } else {
                        System.out.println("El numero " + num + " es un numero impar.");
                    }

                    Menu();

                    opcion = entrada.nextInt();
                }

                break;

                case 4: {

                    int perfecto = 0;

                    contador = 0;

                    numero = 0;

                    System.out.println("Ingrese el numero que desea saber si es perfecto");

                    numero = entrada.nextInt();

                    while (contador < numero) {

                        contador++;

                        if (((numero % contador) == 0) && ((numero / contador) > 0) && (contador < numero)) {
                            perfecto = perfecto + contador;
                        }

                    }

                    if (perfecto == numero) {
                        System.out.println("R// El numero " + numero + " es perfecto.");
                    } else {
                        System.out.println("R// El numero " + numero + " no es perfecto.");
                    }

                    Menu();

                    opcion = entrada.nextInt();
                }

                break;

                case 5: {
                    int anterior = 0;

                    int actual = 1;

                    int resultado;

                    contador = 0;

                    numero = 0;

                    System.out.println("Por favor ingrese la cantidad de digitos que desea visualizar");

                    numero = entrada.nextInt();

                    while (contador < numero) {
                        if (contador < (numero - 1)) {
                            System.out.print(anterior + ", ");

                            resultado = anterior + actual;

                            anterior = actual;

                            actual = resultado;
                        } else {
                            System.out.print(anterior + " ");
                        }

                        contador++;
                    }

                    System.out.println("");

                    Menu();

                    opcion = entrada.nextInt();
                }

                break;

                case 6: {

                    System.exit(0);
                }

                break;

                default: {

                    System.out.println("Ingreso una opcion no valida.");

                    Menu();

                    opcion = entrada.nextInt();
                }

                break;
            }
        } while (opcion > 0);
    }

    public static void Menu() {
        System.out.println("\n-Jose Gerardo Ruiz García\n-2019069\n-IN5AM");

        System.out.println("-------------------MENU------------------");

        System.out.println("1. Pasar segundos a formato HH : MM : SS \n2. Programa Billetes.\n3. Programa par o impar.\n4. Programa numero perfecto.\n5. Programa serie Fibonacci.\n6. Salir");

        System.out.println("Ingrese la opcion que desea.");
    }
}
