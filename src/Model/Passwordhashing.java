/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import org.mindrot.jbcrypt.BCrypt;
/**
 *
 * @author Angel
 */
public class Passwordhashing {
    public static String hashPassword(String plainPassword) {
        String salt = BCrypt.gensalt();
        return BCrypt.hashpw(plainPassword, salt);
    }

    public static boolean checkPassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
}
