/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import org.mindrot.jbcrypt.BCrypt;
import java.util.regex.*;


public class PasswordFunctions {
    // PASSWORD HASHING
    public static String hashInput(String plainInput) {
        String salt = BCrypt.gensalt();
        return BCrypt.hashpw(plainInput, salt);
    }

    public static boolean checkHashed(String plainInput, String hashedInput) {
        return BCrypt.checkpw(plainInput, hashedInput);
    }
    

    // PASSWORD VALIDATION
    public static boolean validatePassword(String plainPassword, String username) {
        // Convert both password and username to lowercase for case-insensitive comparison
        String lowerCasePassword = plainPassword.toLowerCase();
        String lowerCaseUsername = username.toLowerCase();
    
        // Must be minimum length of 15
        if (plainPassword.length() < 15){
            // System.out.println("Password is short");
            return false;
        }
        
        // Must not contain username in any case
        if (lowerCasePassword.contains(lowerCaseUsername)){
            // System.out.println("Password contains username");
            return false;
        }
    
        // Must have uppercase and lowercase
        Pattern upperCasePattern = Pattern.compile("[A-Z]");
        Matcher upperCaseMatcher = upperCasePattern.matcher(plainPassword);
        if (!upperCaseMatcher.find()) {
            // System.out.println("Password must have uppercase");
            return false;
        }
    
        Pattern lowerCasePattern = Pattern.compile("[a-z]");
        Matcher lowerCaseMatcher = lowerCasePattern.matcher(plainPassword);
        if (!lowerCaseMatcher.find()) {
            // System.out.println("Password must have lowercase");
            return false;
        }
    
        // Must have at least 2 numbers and 1 special character
        Pattern numberPattern = Pattern.compile("\\d");
        Matcher numberMatcher = numberPattern.matcher(plainPassword);
        int numberOfDigits = 0;
        while (numberMatcher.find()) {
            numberOfDigits++;
        }
        if (numberOfDigits < 2) {
            // System.out.println("Password must have at least 2 numbers and 1 special character");
            return false;
        }
    
        Pattern specialCharacterPattern = Pattern.compile("[@#$%^&*(),.?\":{}|<>]");
        Matcher specialCharacterMatcher = specialCharacterPattern.matcher(plainPassword);
        if (!specialCharacterMatcher.find()) {
            // System.out.println("Password must have 1 special character");
            return false;
        }   
    
        // If all checks pass
        return true;
    }

    
}

