
package com.mycompany.metodo_burbuja_incersion;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class Metodo_burbuja_incersion {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        while(true){
         menu();
        int longitud = sc.nextInt();
        int [] vector = new int[longitud];
        
        System.out.println("-----------------------------------------------\n");
        System.out.println("Ingrese los datos al vector: \n");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("-----------------------------------------------\n");
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        System.out.println("------------------------------------");
        System.out.println("Seleccione el metodo del vector");
        System.out.println("(1). Metodo de burbuja");
        System.out.println("(2). Metodo de insercion)");
        System.out.println("------------------------------------");
        int opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    
                    System.out.println("-----------------------------------------------\n");
                    System.out.println("Selecciona que mnera quieres que se muestre el vector: \n");
                    System.out.println("(1). Ascendente \n");
                    System.out.println("(2). Descendente \n");
                    System.out.println("-----------------------------------------------\n");
                    opcion = sc.nextInt();
                    if (opcion == 1){
                        mB(vector, true);
                        System.out.println("Vector ordenado de manera ascendente: \n");
                    }else if(opcion == 2){
                        mB(vector, false);
                        System.out.println("Vector ordenado de manera descendente: \n");
                        
                    }else{
                        System.out.println("Opcion invalida.");
                    }
                }
                case 2 -> {
                    System.out.println("-----------------------------------------------\n");
                    mI(vector);
                    System.out.println("Vector utilizando el metodo de incersion: \n");
                    System.out.println("-----------------------------------------------\n");
                }
                default -> System.out.println("Opcion invalida");
            }
            for (int i = 0; i<vector.length; i++){
                System.out.println(vector[i] + "");
            }
       }
     
    }
    public static void menu(){
        System.out.println("-----------------------------------------------\n");
        System.out.println("                  VECTORES                     \n");
        System.out.println("-----------------------------------------------\n");
        System.out.println("Ingrese la cantidad de espacios en el vector: ");
    }
    public static void mB(int[] vector, boolean ascending){
        int n = vector.length;
        int signo = ascending ? 1 : -1;
        for (int i = 0; i < n -1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(vector[j] * signo > vector[j + 1] * signo){
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j+1] = temp;
                }
            }
        }
    }
    public static void mI(int[] vector){
        int n = vector.length;
        for (int i = 1; i < n; i++) {
            int key = vector[i];
            int j = i - 1;
            while (j >= 0 && vector[j] > key) {
                vector[j + 1] = vector[j];
                j--;
            }
            vector[j + 1] = key;
        }
    }
}
