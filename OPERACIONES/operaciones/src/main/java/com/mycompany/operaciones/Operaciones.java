/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operaciones;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class Operaciones {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int opcion;
       
       while(true){
           menu();
           opcion = sc.nextInt();
       switch(opcion){
           case 1:
               sumar();
               break;
           case 2:
               restar();
               break;
           case 3:
               multiplicar();
               break;
           case 4:
               dividir();
               break;
           case 5:
               System.out.println("ADIOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOH BAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!!!");
               System.exit(0);
               break;
           default:
               System.out.println("Opcion INVALIDA");
               break;
                      }    
                   }
    } 
        public static void menu(){
        System.out.println("-----------------------------------------------------------\n");
        System.out.println("Ingresa la Opcion que necesitas: \n");
        System.out.println("(1) Suma\n");
        System.out.println("(2) Resta\n");
        System.out.println("(3) Multiplicacion\n");
        System.out.println("(4) Division\n");
        System.out.println("(5) SALIR\n");
        System.out.println("-----------------------------------------------------------\n");
        }
        public static void sumar(){
        System.out.println("-----------------------------------------------------------\n");
        System.out.println("Haz escogido la opcion SUMA\n");
        System.out.println("Ingresa el prime numero para operar: \n");
        Scanner sc = new Scanner(System.in);
        double num_1 = sc.nextDouble();
        System.out.println("Ingresa el siguiente Valor: \n");
        double num_2 = sc.nextDouble();
        double resultado;
        resultado = num_1 + num_2;
        System.out.println("Tu  resultado es: \n" + resultado);
        System.out.println("-----------------------------------------------------------\n");
    }
        public static void restar(){
        System.out.println("-----------------------------------------------------------\n");
        System.out.println("Haz escogido la opcion RESTAR\n");
        System.out.println("Ingresa el prime numero para operar: \n");
        Scanner sc = new Scanner(System.in);
        double num_1 = sc.nextDouble();
        System.out.println("Ingresa el siguiente Valor: \n");
        double num_2 = sc.nextDouble();
        double resultado;
        resultado = num_1 - num_2;
        System.out.println("Tu  resultado es: \n" + resultado);
        System.out.println("-----------------------------------------------------------\n");
        }
        public static void multiplicar(){
        System.out.println("-----------------------------------------------------------\n");
        System.out.println("Haz escogido la opcion MULTIPLICAR\n");
        System.out.println("Ingresa el prime numero para operar: \n");
        Scanner sc = new Scanner(System.in);
        double num_1 = sc.nextDouble();
        System.out.println("Ingresa el siguiente Valor: \n");
        double num_2 = sc.nextDouble();
        double resultado;
        resultado = num_1 * num_2;
        System.out.println("Tu  resultado es: \n" + resultado);
        System.out.println("-----------------------------------------------------------\n");
        }
        public static void dividir(){
        System.out.println("-----------------------------------------------------------\n");
        System.out.println("Haz escogido la opcion DIVISION\n");
        System.out.println("Ingresa el prime numero para operar: \n");
        Scanner sc = new Scanner(System.in);
        double num_1 = sc.nextDouble();
        System.out.println("Ingresa el siguiente Valor: \n");
        double num_2 = sc.nextDouble();
        double resultado;
        resultado = num_1 / num_2;
        System.out.println("Tu  resultado es: \n" + resultado);
        System.out.println("-----------------------------------------------------------\n");
        }
}
