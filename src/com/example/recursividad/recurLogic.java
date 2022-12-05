package com.example.recursividad;

public class recurLogic {

    static int pos = 0;
    private int[] vector;
    public recurLogic(int[] v) {
        vector = v;
    }

    public void printArray(int pos){
        if (pos == vector.length-1) {
            System.out.println("Elemento en la posición "+pos + " es "+vector[pos]);
        }
        else {
            System.out.println("Elemento en la posición "+pos + " es "+vector[pos]);
            printArray(pos+1);
        }
    }

    public static int recursiveSearch(int[] arr, int numtoSearch) {
        if (pos>=arr.length) {
            pos=0;
            return -1;
        }
        if (arr[pos]==numtoSearch){
            System.out.println("el numero " + numtoSearch + " se encuentra en la posicion " +pos);
            return (pos+1);
        }
        else {
            pos++;
            return recursiveSearch(arr, numtoSearch);
        }

    }

    public static void printMatrix(int[][] mat, int i, int j) {
        if(mat==null){
            return;
        }
        if(i==mat.length || j==mat[0].length){
            return;
        }
        System.out.print(mat[i][j]+" ");
        if(j==mat[0].length-1){
            System.out.println();
            printMatrix(mat,i+1,0);
        }
        printMatrix(mat,i,j+1);
    }
}
