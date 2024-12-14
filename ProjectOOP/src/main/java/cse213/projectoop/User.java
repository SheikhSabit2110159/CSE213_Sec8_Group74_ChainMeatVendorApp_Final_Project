package cse213.projectoop;

public class User {

    private String id, name, password, email, phoneNumber;

    public User(String id, String name, String password, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = this.generateID();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                '}';
    }
    public String generateID(String type) {
        String id = "";


        if(type== "Employee") {
            id += this.name.substring(0, 3);
            id += this.email.substring(0, 3);
            id += this.phoneNumber.substring(this.getPhoneNumber().length());
        }
        else if(type == "ShopManager") {
            id += this.phoneNumber.substring(0,2);
            id += this.email.substring(0,2);

        }
        return id;
    }


    public boolean loginVR(String id, String password) {
        if(this.getId()== id && this.getPassword() == password){
            return true;
        }
        return false;
    }



}
