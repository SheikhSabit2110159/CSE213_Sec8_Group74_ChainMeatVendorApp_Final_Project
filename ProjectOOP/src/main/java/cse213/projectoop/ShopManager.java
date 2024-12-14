package cse213.projectoop;


public class ShopManager extends User{
    public ShopManager(String id, String name, String password, String email, String phoneNumber) {
        super(id, name, password, email, phoneNumber);
    }


    public record shopManager(String id, String password) {

        public boolean loginVR(String id, String password) {
            return this.id.equals(id) && this.password.equals(password);
        }
    }

