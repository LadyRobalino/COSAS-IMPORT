package matrices;

import java.util.Scanner;

public class SumaDeDosMatrices {
    public static void main(String[] args) {
        Scanner lady = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas de la primera matriz:");
        int filas1 = lady.nextInt();
        System.out.println("Ingrese el numero de columnas de la primera matriz:");
        int columnas1 = lady.nextInt();
        int sumaM1 = 0;
        int matriz1[][] = new int[filas1][columnas1];
        
        System.out.println("Ingrese el numero de filas de la primera matriz:");
        int filas2 = lady.nextInt();
        System.out.println("Ingrese el numero de columnas de la segunda matriz:");
       
        int columnas2 = lady.nextInt();
         System.out.println("=====================================================");
        int sumaM2 = 0;
        int matriz2[][] = new int[filas2][columnas2];
        //Llenar matriz1
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.println("Ingrese los valores de la primera matriz: ");
                matriz1[i][j] = lady.nextInt();
                sumaM1 += matriz1 [i][j];
            }
        }
        presentarMatriz1(matriz1, filas1, columnas1);
        
         //Llenar matriz2
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.println("Ingrese los valores de la segunda matriz: ");
                
                matriz2[i][j] = lady.nextInt();
                System.out.println("============================================");
                sumaM2 += matriz2 [i][j];
            }
        }
        presentarMatriz2(matriz2, filas2, columnas2);
        presentarMatrizFinal(matriz1, matriz2, filas2, columnas2, sumaM2);
        
    }
    //presentar matriz 1
    public static void presentarMatriz1(int matriz[][], int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("=====================================================");
    }
    
    //presentar matriz 2
    public static void presentarMatriz2(int matriz[][], int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
    }
    
    public static void presentarMatrizFinal(int matriz1[][], int matriz2[][], int filas, int columnas, int sumaT){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaT =  (matriz1[i][j] + matriz2[i][j]);
                System.out.println("[" + sumaT + "]");
            }
            System.out.println("");
        }
    }
    
}
