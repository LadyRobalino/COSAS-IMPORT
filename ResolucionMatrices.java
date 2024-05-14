package matrices;

import java.util.Scanner;

public class ResolucionMatrices {

    public static void main(String[] args) {
        Scanner lady = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas:");
        int filas = lady.nextInt();
        System.out.println("Ingrese el numero de columnas:");
        int columnas = lady.nextInt();
        int sumaM = 0;
        int matriz[][] = new int[filas][columnas];

        llenarMatriz(matriz, filas, columnas);

        System.out.println("=======MATRIZ LLENADA=======");
        presentarMatriz(matriz, filas, columnas);
        System.out.println("=======MATRIZ ORDENADA========");
       
  
        int array[] = new int [filas];
        burbuja(matriz);
       for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
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

    // Ordenar matriz metodo burbuja
    public static void burbuja(int matriz[][] ) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length - 1; j++) {
                for (int k = 0; k < matriz[i].length - j - 1; k++) {
                    if (matriz[i][k] < matriz[i][k + 1]) {
                        // Intercambiar los elementos si están en el orden incorrecto
                        int temp = matriz[i][k];
                        matriz[i][k] = matriz[i][k + 1];
                        matriz[i][k + 1] = temp;
                    }
                }
            }
        }
    }
}
