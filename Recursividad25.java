package recursividad.pkg2.pkg5;
import java.util.Scanner;
public class Recursividad25 {
    public static void main(String[] args) {
        Scanner lady = new Scanner(System.in);
        String flag;
        System.out.println("Ingrese una palabra palindrome;");
        flag = lady.nextLine();
        System.out.println(palindromeCheck(flag.toLowerCase().replace(" ","").replace(".","")));      
    }

    public static boolean palindromeCheck(String s){
        if(s.length() == 0 || s.length() == 1){
            return true;
        } else{
            return s.charAt(0) == s.charAt(s.length()-1) &&
                    palindromeCheck(s.substring(1,s.length()-1));
        }
    }   
}
