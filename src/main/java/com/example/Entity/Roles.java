package com.example.Entity;

import javax.persistence.*;

@Entity
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer role_id;
    private  String RoleName;

    @ManyToMany
    @JoinTable(
            name="UsersRoles",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name="user_id")
    )

    public Roles() {

    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }

    public Roles(Integer role_id, String roleName) {
        this.role_id = role_id;
        RoleName = roleName;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "role_id=" + role_id +
                ", RoleName='" + RoleName + '\'' +
                '}';
    }
}
