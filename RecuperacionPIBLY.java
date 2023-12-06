package recuperacionpib.ly;
import java.util.Scanner;
public class RecuperacionPIBLY {
    public static void main(String[] args) {
        Scanner lady = new Scanner(System.in);
        int diaCorte = 10, diaActual, operacion=1, diaPago = 30;
        double millas = 1.5, totalMillas=0, gasto, deuda=0, limite=5000;
        do{
            System.out.println("Inserte el dia actual:");
            diaActual = lady.nextInt();
            if (diaActual == diaCorte){
                operacion=1;
            }
            if (diaActual > diaCorte){
                operacion=3;
                break;               
            }
            System.out.println("Cuanto va a gastar?");
            gasto= lady.nextDouble();
            if (gasto <= limite){
                limite= limite - gasto;
                deuda= deuda + gasto;
                totalMillas= (gasto * millas) + totalMillas;
                
                
            }else{
                operacion=2;
                break;
            }
            
            if (limite > 4750){
                System.out.println("Esta por llegar al 5% de su limite!");    
            }else if (limite > 4500){
                System.out.println("Esta por llegar al 10% de su limite!");              
            }else if (limite > 2500){
                System.out.println("Esta por llegar al 50% de su limite!");
            }else{
                System.out.println("Esta por llegar al 60% de su limite!");
            }       
        }while (diaActual <= diaCorte);
        if (operacion != 1 && operacion != 2){
            operacion = 3;
        }
        switch (operacion){
            case 1: {
                System.out.println("Usted debe pagar: " + deuda + "hasta el dia " + diaPago + " y tiene un total de  " + totalMillas + "millas");
                limite = 5000;
                break;
            }
            case 2: {
                System.out.println("Usted ya no tiene cupo disponible y debe pagar $5000 hasta " + diaPago + " y tiene 4500 millas");
                limite= 5000;
                break;
            }
            case 3: {
                System.out.println("Puede disponer de todo el cupo maximo de " + limite + " porque a la fecha de corte " + diaPago + " debe pagar " + deuda + " por las cuales ha ganado " + totalMillas + " millas");
                break;               
            }
        }
    }   
}
