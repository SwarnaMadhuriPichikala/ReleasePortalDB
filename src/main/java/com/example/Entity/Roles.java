package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Roles {
    @Id
    private  int role_id;
    private  String RoleName;

    public Roles() {
        
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }

    public Roles(int role_id, String roleName) {
        this.role_id = role_id;
        RoleName = roleName;
    }
}
