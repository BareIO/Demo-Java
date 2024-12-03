import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

public class LoginSystem {
    private static final String USERNAME = "admin";
    private static final String HASHED_PIN = hashPin("1234");

    public static void main(String[] args) {
        String username = "admin";
        String pin = "1234";    

        if (isValidCredentials(username, pin)) {
            System.out.println("Welcome, " + username + "!");
        } else {
            System.out.println("Invalid username or PIN. Please try again.");
        }
    }

    private static boolean isValidCredentials(String username, String pin) {
        return username.equals(USERNAME) && MessageDigest.isEqual(HASHED_PIN.getBytes(), hashPin(pin).getBytes());
    }

    private static String hashPin(String pin) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(pin.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}