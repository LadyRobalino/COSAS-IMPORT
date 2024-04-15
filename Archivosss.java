package archivosss;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Archivosss {

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
        try(FileWriter myWriter = new FileWriter("carpeta lady.txt", true)){
            myWriter.write("Soy Lady :p\n\ndavideeee\n");
            //myWriter.append("EJEMPLO 2 UTPL\n");
            myWriter.close();
            System.out.println("El archivo ha sido creado");
        } catch (IOException e){
            System.out.println("Error de escritura");
        }
        
        System.out.println("LEEMOS EL ARCHIVO");
        try (FileReader lady = new FileReader("carpeta lady.txt")){
            int i;
            while ((i = lady.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            System.out.println("Error de lectura");
        }
        File file1 = new File("carpeta lady.txt");
        System.out.println("longitud de archivo: " + file1.length());
       
    }
    
}
