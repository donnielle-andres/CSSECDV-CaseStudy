/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author Angel
 */
import java.util.regex.Pattern;


public class InputSanitation {

    private static final Pattern INT_PATTERN = Pattern.compile("^\\d+$"); // Matches whole positive integers
    private static final Pattern MONEY_PATTERN = Pattern.compile("^\\d*\\.?\\d*$"); // Matches positive decimals

    
    public static int sanitizeInt(String input) {
        if (input == null || input.isEmpty() || !INT_PATTERN.matcher(input).matches()) {
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

    public static double sanitizeMoney(String input) {
        // This sanitizes an input to be only Positive numbers (decimals allowed)
        if (input == null || input.isEmpty() || !MONEY_PATTERN.matcher(input).matches()) {
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

    public static String sanitizeString(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "";
        }

        // Expanded character removal
        String sanitized = input.replaceAll("[\"'%;)(+\\\\\r\n]", "");

        if (sanitized.length() > 255) { 
            throw new IllegalArgumentException("Input string exceeds maximum length.");
        }

        return sanitized;
    }

}
