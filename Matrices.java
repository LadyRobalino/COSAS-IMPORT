package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        /*int matriz [][] = {{2,4,3}, {8,9,6},{2,3}};
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
        }     
        */
        Scanner lady = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas:");
        int filas = lady.nextInt();
        System.out.println("Ingrese el numero de columnas:");
        int columnas = lady.nextInt();
        int sumaM = 0;
        int matriz[][] = new int[filas][columnas];
        
        //Llenar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese los valores de la matriz:");
                matriz[i][j] = lady.nextInt();
                sumaM += matriz [i][j];
            }
        }
        presentarMatriz(matriz, filas, columnas, sumaM);
        
        
    }
    //presentar matriz
    public static void presentarMatriz(int matriz[][], int filas, int columnas, int sumaM){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("Suma total:" + sumaM);
    }
    
   
}
