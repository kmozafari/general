package ir.kmozafari.general.web.controller.model;

import java.util.ArrayList;

/**
 * Created by k.mozafari on 8/17/2016.
 */
public class UserAddInfo {

    private String userId;
    private String password;
    private ArrayList<String> roles = new ArrayList<String>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<String> roles) {
        this.roles = roles;
    }
}
