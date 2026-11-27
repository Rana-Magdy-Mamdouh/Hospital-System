/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.system.users;

/**
 *
 * @author SPEED
 */
public class User {

    private int id;
    private String phone;
    private String name;
    private String email;
    private String password;
    private UserRole role;

    public User(int id, String phone, String name, String email, String password, UserRole role) {
        this.id = id;
        setPhone(phone);
        setEmail(email);
        setName(name);
        setPassword(password);
        setRole(role);
    }

    public int getId() {
        return this.id;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public UserRole getRole() {
        return this.role;
    }

    public void setPhone(String phone) {
        if (phone != null && phone.length() == 11) {
            this.phone = phone;
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
        }
    }

    public void setRole(UserRole role) {
        if (role != null) {
            this.role = role;
        } else {
            System.out.println("Invalid role");
        }

    }
    public String getInfo(){
      return   "Id: "+ id + "| Name: " +name+"| Email: " +email+"| Phone: " +phone+"| Role: " +role ;
    }
    }

