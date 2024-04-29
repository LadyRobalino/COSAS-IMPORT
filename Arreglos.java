package arreglos;

import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
        int miArray[] = new int[5];
        Scanner lady = new Scanner(System.in);

        for (int i = 0; i < miArray.length; i++) {
            System.out.println("Dato[ " + i + "]");
            miArray[i] = lady.nextInt();
        }
        for (int i = 0; i < miArray.length; i++) {
            System.out.println("miArray[" + i + "]" + miArray[i]);
        }

        //PRESENTAR EL NUMERO ENCONTRADO
        System.out.println("Ingrese numero a buscar:");
        int numBuscar = lady.nextInt();
        int indice = buscar(miArray, numBuscar);
        if (indice == -1) {
            System.out.println("Numero no encontrado");
        } else {
            System.out.println("Numero encontrado en posicion n " + indice);
        }

        //ELIMINAR DATO
        System.out.println("Ingrese numero a eliminar:");
        int numEliminar = lady.nextInt();
        int indiceE = buscar(miArray, numEliminar);
        if (indiceE == -1) {
            System.out.println("NUmero no encontrado");
        } else {
            eliminar(miArray, indiceE);
            for (int i = 0; i < miArray.length; i++) {
                System.out.println("miArray [" +i+ "]:" + miArray[i]);

            }
        }
    }
    //Ingresar Datos
    public static int ingrsarDatos(int miArray[]){
        Scanner lady = new Scanner(System.in);        
        for (int i = 0; i < miArray.length; i++) {
            System.out.println("Dato[ " + i + "]");
            miArray[i] = lady.nextInt();
        }
        return 0;
        
    }
    
    
    
    
    
    
    
    //Presentar datos

    //Buscar un arreglo 
    public static int buscar(int miArray[], int numBuscar) {
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] == numBuscar) {
                return i;
            }
        }
        return -1;
    }

    //Eliminar un arreglo 
    public static void eliminar(int miArray[], int indice) {
        if (indice != -1) {
            int i = indice;
            for (; i < miArray.length - 1; i++) {
                miArray[i] = miArray[i + 1];
            }
            miArray[i] = 0;
        }
    }
}
