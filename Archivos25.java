package archivos.pkg2.pkg5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Archivos25 {
    public static void main(String[] args) {
        try {
            File file= new File("carpeta lady.txt");
            if(file.createNewFile()){
                 System.out.println("Archivo creado: " + file.getName());
                System.out.println("Archivo creado " + file.getPath());
            } else {
                System.out.println("El archivo ya exite ");
                System.out.println("Archivo creado: "+ file.getPath());
            }         
        } catch (IOException e) {
            System.out.println("Error");
        }
        
        
        try {FileOutputStream fos = new FileOutputStream("carpeta lady.txt");
            String data = "Esto es un ejemplo de Stream con bytes\n";
            byte b []=data.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Se ha escrito en el archivo.");
        } catch (Exception e) {
            System.out.println("Error de escritura");           
        }
        
        try {
            FileInputStream fis = new FileInputStream("carpeta lady.txt");
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
            System.out.println("Error de lectura");
        }
        
        
        //ESCRIBIR ARCHIVO   BUFFERED:
        try {BufferedWriter myBufferWrite = new BufferedWriter(new FileWriter("carpeta 2.txt"));
            myBufferWrite.write("Esto es un ejercicio usando buffered 1\n");
            myBufferWrite.write("Esto es un ejercicio usando buffered 2\n");       
        } catch (Exception e) {
            System.out.println("Error de escribir archivo");
        }
        
        
        //LEER ARCHIVO
        try {BufferedReader myBufferRead = new BufferedReader(new FileReader("carpeta 2.txt"));
            String line = myBufferRead.readLine();
            while(line != null);{
            System.out.println(line);
            line = myBufferRead.readLine();
            }           
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
    
}
