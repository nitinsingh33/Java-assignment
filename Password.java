// Here I am using random() method of util
import java.util.*;

public class Password{
    
    public static void main(String[] args) {

        int length = 10;
        System.out.println(geek_Password(length));
    }
    
    // This is our Password generating method
    
    static char[] geek_Password(int len) {
        
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");

     
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
                String symbols = "@#$*!";

        
        String values = Capital_chars + Small_chars + numbers + symbols;  
         
        
        // Using random method
        Random rndm_method = new Random();

        char[] password = new char[len];

        for (int i = 0; i < len; i++) {

           
            password[i] =
              values.charAt(rndm_method.nextInt(values.length()));
        }
        return password;
    }
    
}
