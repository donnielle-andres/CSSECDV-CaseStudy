/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author Angel
 */


public class InputSanitation {

    public int sanitizeInt(String input) {
        // This sanitizes an input to be only WHOLE, POSITIVE numbers
        if (input == null || input.isEmpty()) {
            return 0;
        }

        input = input.replaceAll("[^0-9]", "");

        if (input.isEmpty()) {
            return 0;
        }

        try {
            int sanitized = Integer.parseInt(input);
            if (sanitized >= 0) {
                return sanitized;
            } else {
                return 0;
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public double sanitizeMoney(String input) {
        // This sanitizes an input to be only Positive numbers (decimals allowed)
        if (input == null || input.isEmpty()) {
            return 0.0;
        }

        input = input.replaceAll("[^0-9.]", "");

        if (input.isEmpty()) {
            return 0.0;
        }

        try {
            double sanitized = Double.parseDouble(input);
            if (sanitized >= 0) {
                return sanitized;
            } else {
                return 0.0;
            }
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public String sanitizeString(String input) {

        if (input == null || input.trim().isEmpty()) {
            return "";
        }

        // Remove potentially harmful characters
        String sanitized = input.replaceAll("[<>\"'%;)(&+]", "");

    
        sanitized = sanitized.replaceAll("([\\\\])", "\\\\$1");
        sanitized = sanitized.replaceAll("([\r\n])", "");

        return sanitized;
    }

}
