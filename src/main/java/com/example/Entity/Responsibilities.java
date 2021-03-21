package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Responsibilities {
    @Id
    private int  resp_id;
    private String responsibilityname;

    public int getResp_id() {
        return resp_id;
    }

    public void setResp_id(int resp_id) {
        this.resp_id = resp_id;
    }

    public String getResponsibilityname() {
        return responsibilityname;
    }

    public void setResponsibilityname(String responsibilityname) {
        this.responsibilityname = responsibilityname;
    }
}
