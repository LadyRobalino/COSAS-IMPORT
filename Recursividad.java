package recursividad;
import java.util.Scanner;
public class Recursividad {
    public static void main(String[] args) {
        Scanner lady = new Scanner(System.in);
        int potenciaa = 1, b = 2, e = 4, sumaT, a, b1 ;
        for (int i = 0; i < 4; i++) {
            potenciaa = potenciaa * b;
            System.out.println(potenciaa);
        }
        sumaT = suma(5,10);
        System.out.println(sumaT);
    }

    public static int potencia(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * potencia(x, n - 1);
        }
    }

    public static int suma(int a, int b) {
        if(a < b){
            return a + suma(a+1,b);
        }else{
            return b;
            
        }
    }
}
