/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

/**
 *
 * @author moaaznotadmin
 */
public class Admin implements IUser{
    private String name;
    private String password;
    private int ID;

    public Admin(String name, String password, int ID) {
        this.name = name;
        this.password = password;
        this.ID = ID;
    }

    @Override
    public String allowedTime() {
        return "09:00 - 17:00";
    }
    
}
