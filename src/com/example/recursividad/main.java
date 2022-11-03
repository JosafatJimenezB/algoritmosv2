package com.example.recursividad;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        /// Declaracion de los arreglos y variables
        int opc = 0;
        int[] a = {2, 3, 8, 1, 9};
        int[][] matrix = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 }};

        //Declaracion de los objetos
        recurLogic ar = new recurLogic(a);
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("--------- Menu ---------");
            System.out.println("1.- Imprimir Arreglo");
            System.out.println("2.- Buscar en el arreglo");
            System.out.println("3.- Imprimir Matriz");
            System.out.println("4.- Salir....");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Impresion del arreglo");
                    ar.printArray(0);
                    break;

                case 2:
                    System.out.println("Buscar dentro del arreglo");
                    System.out.println("Ingrese el numero a encontrar");
                    int b = sc.nextInt();
                    ar.recursiveSearch(a, b);
                    break;

                case 3:
                    System.out.println("Impresion de la matriz");
                    ar.printMatrix(matrix, 0, 0);
                    break;

                case 4:
                    System.out.println("Saliendo...");
            }


        }while(opc != 4);
    }
}
