package matrices;

import java.util.Scanner;

public class MatrizTranspuestaa {

    public static void main(String[] args) {
        Scanner lady = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas:");
        int filas = lady.nextInt();
        System.out.println("Ingrese el numero de columnas:");
        int columnas = lady.nextInt();
        int sumaM = 0;
        int matriz[][] = new int[filas][columnas];

        llenarMatriz(matriz, filas, columnas);
        System.out.println("MATRIZ LLENADA");
        presentarMatriz(matriz, filas, columnas);
        
        // Crear y presentar la matriz transpuesta
        int matrizTranspuesta[][] = crearMatrizTranspuesta(matriz, filas, columnas);
        presentarMatrizTranspuesta(matrizTranspuesta, columnas, filas);

    }
     //Llenar matriz
    public static void llenarMatriz(int matriz[][], int filas, int columnas) {
        Scanner lady = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese los valores de la matriz:");
                matriz[i][j] = lady.nextInt();
            }
        }

    }

    //presentar matriz
    public static void presentarMatriz(int matriz[][], int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");

        }

    }
    //crearMatrizTranspuesta
    public static int[][] crearMatrizTranspuesta(int matriz[][], int filas, int columnas) {
        int[][] matrizTranspuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTranspuesta;
    }
    //presentarMatrizTranspuesta
    public static void presentarMatrizTranspuesta(int matriz[][], int filas, int columnas) {
        System.out.println("MATRIZ TRANSPUESTA");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
