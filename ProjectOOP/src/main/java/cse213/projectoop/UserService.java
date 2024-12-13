package cse213.projectoop;

import java.util.HashMap;

public class UserService {

    // A map to store user credentials: email -> password
    private static final HashMap<String, String> userDatabase = new HashMap<>();

    // A map to store user types: email -> userType (e.g., "Customer" or "Vendor")
    private static final HashMap<String, String> userTypes = new HashMap<>();

    // Save user details (including user type)
    public static boolean createAccount(String email, String password, String userType) {
        if (userDatabase.containsKey(email)) {
            return false;  // User already exists
        }
        userDatabase.put(email, password);
        userTypes.put(email, userType);  // Store the user type
        return true;
    }

    // Validate login credentials
    public static boolean login(String email, String password) {
        return userDatabase.containsKey(email) && userDatabase.get(email).equals(password);
    }

    // Get the user type (Customer or Vendor)
    public static String getUserType(String email) {
        return userTypes.getOrDefault(email, "Unknown");
    }
}
