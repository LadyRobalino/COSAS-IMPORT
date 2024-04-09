package ejercil;

import java.util.Scanner;

public class EjerciL {

    public static void main(String[] args) {

        /*
        String Nombre,Apellido, nombreCompleto;
        Nombre="Lady ";
        Apellido="Robalino";
        nombreCompleto= Nombre+""+Apellido;
        int largo= nombreCompleto.length();
        System.out.println("largo cadena= "+largo);
        
        String subCadena1= nombreCompleto.substring(0,13);
        System.out.println(subCadena1);
        
        boolean bol1=nombreCompleto.equalsIgnoreCase("Lady Robalino");
        System.out.println(bol1);
        
        
        Scanner lady =new Scanner (System.in);
        String nombre;
        double altura,peso,IMC;
        System.out.println("Ingrese su nombre:");
        nombre= lady.nextLine();
        System.out.println("Ingrese su peso en libras:");
        peso=lady.nextDouble();
        System.out.println("Ingrese su altura en centimetros:");
        altura=lady.nextDouble();
        peso=peso*0.45;
        altura=(altura*altura)*0.0001; 
        IMC=peso/altura; 
        System.out.println(nombre+" su IMC es "+IMC);
         
        String u="La #Universidad Tecnica Particular de Loja# tiene dos modalidades de estudios.";
        int pos1=u.indexOf("#"); 
        int pos2=u.indexOf("#",pos1+1);
        String nom= u.substring(pos1+1,pos2);
        System.out.println(nom);
         */
        String n = "El espacio exterior";
        int vocales = 0, consonantes = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i'
                    || n.charAt(i) == 'o' || n.charAt(i) == 'a')
                vocales++;
            else
                consonantes++;
        }
        System.out.println("tiene "+ vocales+" vocales y "+consonantes+" consonantes");
    }
}
