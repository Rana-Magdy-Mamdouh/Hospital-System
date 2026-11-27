/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.system.users;
import java.util.ArrayList ;
/**
 *
 * @author SPEED
 */
public class UserService {
    private ArrayList <User> users;
    public UserService(){
        this.users = new ArrayList<>() ;
    }
    
    public boolean addUser(User user){
       if (user == null || user.getEmail() == null) {
            return false;
        }
        for(User u :this.users){
            if(u.getId()==user.getId()||u.getEmail().equalsIgnoreCase(user.getEmail())){
                return false ;
            }
        }
        this.users.add(user);
        return true;
    }
    public User login(String email , String password){
        if(email==null || password == null){
            return null ;
        }
        for(User u :this.users){
            if(u.getEmail().equalsIgnoreCase(email)&&u.getPassword().equals(password)){
                return u ;
            }
        }
        return null ;
    }
    public User finduUserById(int id){
        for(User u : this.users){
            if(u.getId()==id){
                return u ;
            }
        }
        return null ;
    }
    
    public ArrayList<User> getAllUsers(){
        return new ArrayList<>((this.users));
    }
    
    
}
