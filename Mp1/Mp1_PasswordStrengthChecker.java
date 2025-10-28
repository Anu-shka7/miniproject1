import java.util.Scanner;
public class Mp1_PasswordStrengthChecker 
{
     public static void main(String[] args) 
     { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a password: "); 
        String password = sc.nextLine(); 
        int strength = 0; 
        // Rule 1: Length 
        if (password.length() >= 8) strength++; 
        // Rule 2: Numbers 
        if (password.matches(".*[0-9].*")) strength++; 
        // Rule 3: Special characters 
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) strength++; 
        // Rule 4: Upper + Lower case 
        if (password.matches(".*[A-Z].*") && password.matches(".*[a-z].*")) strength++; 
        // Result 
        if (strength <= 1) 
        { 
            System.out.println("Password Strength: Weak");
        }
        else if (strength == 2 || strength == 3) 
        { 
            System.out.println("Password Strength: Medium");
        } 
        else 
        { 
            System.out.println("Password Strength: Strong");
        }
    } 
}