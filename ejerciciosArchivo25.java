package ejerciciosArchivo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejerciciosArchivo25 {

    public static void main(String[] args) {
        Scanner ladyyy = new Scanner(System.in);
        int lim = 5;
        String name, edad;
        try {
            File file = new File("carpetaNombre.txt");
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + file.getName());
                System.out.println("Archivo creado " + file.getPath());
            } else {
                System.out.println("El archivo ya exite ");
                System.out.println("Archivo creado: " + file.getPath());
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

        try {
            BufferedWriter myBufferWrite = new BufferedWriter(new FileWriter("carpetaNombre.txt"));
            for (int i = 0; i < lim; i++) {
                System.out.println("Ingrese su nombre:");
                name = ladyyy.nextLine();
                System.out.println("Ingrese su edad:");
                edad = ladyyy.nextLine();
                myBufferWrite.write("Nombre: " + name + "- Edad: " + edad + "\n");
            }
            myBufferWrite.close();
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo");
        }

        try {
            BufferedReader myBufferRead = new BufferedReader(new FileReader("carpetaNombre.txt"));
            String line = myBufferRead.readLine();
            while (line != null) {
                System.out.println(line);
                line = myBufferRead.readLine();
            }
            myBufferRead.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}
