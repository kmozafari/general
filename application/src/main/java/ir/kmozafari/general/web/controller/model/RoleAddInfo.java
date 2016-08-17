package ir.kmozafari.general.web.controller.model;

import java.util.ArrayList;

/**
 * Created by k.mozafari on 08/17/2016.
 */
public class RoleAddInfo {

    private String name;
    private ArrayList<String> authorities = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(ArrayList<String> authorities) {
        this.authorities = authorities;
    }
}
