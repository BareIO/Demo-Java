/**
 * Simulates a simple login system in Java.
 * 
 * This program checks if the provided PIN and username match the predefined credentials.
 * If the credentials are correct, it displays a welcome message; otherwise, it displays an error message.
 *
 * Simulates a simple login system in Java.
 * 
 * This program checks if the provided PIN and username match the predefined credentials.
 * If the credentials are correct, it displays a welcome message; otherwise, it displays an error message.
 */



public class LoginSystem {
    private static final String USERNAME = "admin";
    private static final String PIN = "1234";

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
        return username.equals(USERNAME) && pin.equals(PIN);
    }
}