package com.mycompany.mavenproject2;
//VECTORES POR: JOSE FERNANDO RAMIREZ BRAVO
import java.util.Scanner;
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        while(true){
         menu();
        int longitud = sc.nextInt();
        int [] vector = new int[longitud];
        
        System.out.println("Ingrese los datos al vector: \n");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        System.out.println("Los datos guardadoes en el vector son: \n");
        for(int i = 0; i< vector.length; i++){
            System.out.println(vector[i]);
        }
       }
     
    }
    public static void menu(){
        
        System.out.println("-----------------------------------------------\n");
        System.out.println("                  VECTORES                     \n");
        System.out.println("-----------------------------------------------\n");
        System.out.println("Ingrese la cantidad de espacios en el vector: ");
    }
}
