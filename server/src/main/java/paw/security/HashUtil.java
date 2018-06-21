package paw.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class HashUtil {

    public static String getMD5Hash(String input) {
        MessageDigest md = null;
        String result = null;
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(input.getBytes());
            result = Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getMD5Hash("djwojtas"));
    }
}
