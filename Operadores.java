
package operadores;

public class Operadores {

    public static void main(String[] args) {
        int a=12, b=14;
        System.out.println("a=" +a+""+"b="+b);
        a++;
        b--;
        System.out.println("a++=" +a+""+"b--="+b);
        ++a;
        --b;
        System.out.println("++a=" +a+""+"--b="+b);
        
        int c=a++;
        int d=b--;
        
        System.out.println("c="+c+"d="+d+"a="+a+"b="+b);
        int e=++a;
        int f=--b;
        System.out.println("a="+a+"b="+b+"e="+e+"f="+f);
        
        
        boolean bol1=a==b;
        boolean bol2=b<=f;
        
        if(bol1==true)
            System.out.println("bol1 es true");
        else
            System.out.println("bol1 es false");
        if(bol2==true)
            System.out.println("bol2 es true");
        else
            System.out.println("bol2 es false");
        if(bol1 || bol2)
            System.out.println("true");
        else
            System.out.println("false");
    }
    
}
