package com.example.Entity;
import javax.persistence.*;
@Entity
// @Table(name = "Employee_table") This is optional
public class User {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO) This is used when ID has to be auto generated.
    //@Column(name = "employeeid") added to create column name with given
    private Integer user_id;
    private String EmpName;
    private String email;
    private String employeepassword;
    @ManyToMany
    @JoinTable(
            name="UsersRoles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name="role_id")
    )

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", EmpName='" + EmpName + '\'' +
                ", email='" + email + '\'' +
                ", employeepassword='" + employeepassword + '\'' +
                '}';
    }

    public User() {

    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeepassword() {
        return employeepassword;
    }

    public void setEmployeepassword(String employeepassword) {
        this.employeepassword = employeepassword;
    }

    public User(Integer user_id, String empName, String email, String employeepassword) {
        this.user_id = user_id;
        EmpName = empName;
        this.email = email;
        this.employeepassword = employeepassword;
    }
}
