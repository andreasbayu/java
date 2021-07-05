/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author andbayu
 */
public class Login {

    private String username, password;

    public Login() {
        username = "admin";
        password = "123";
    }
    
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public Login(String username) {

    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword(){
        return password;
    }
}
