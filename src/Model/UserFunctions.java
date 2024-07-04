/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.regex.*;

public class UserFunctions {
    
    public static boolean validateUsername(String username) {

        // Must be minimum length of 8
        if (username.length() < 8){
            // System.out.println("Username is short");
            return false;
        }

        // Must be alphanumeric and lowercase only
        Pattern lowerCaseAndDigitPattern = Pattern.compile("^[a-z0-9]+$");
        Matcher lowerCaseAndDigitMatcher = lowerCaseAndDigitPattern.matcher(username);
        if (!lowerCaseAndDigitMatcher.matches()) {
            // System.out.println("Username must be alphanumeric and lowercase only");
            return false;
        }

        // Must have at least 2 numbers
        Pattern numberPattern = Pattern.compile("\\d");
        Matcher numberMatcher = numberPattern.matcher(username);
        int numberOfDigits = 0;
        while (numberMatcher.find()) {
            numberOfDigits++;
        }
        if (numberOfDigits < 2) {
            // System.out.println("Username must have at least 2 numbers");
            return false;
        }

        // If all checks pass
        return true;
    }

}
