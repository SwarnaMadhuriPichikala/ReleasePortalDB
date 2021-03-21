package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Responsibilities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer  resp_id;
    private String responsibilityname;

    public Integer getResp_id() {
        return resp_id;
    }

    public void setResp_id(Integer resp_id) {
        this.resp_id = resp_id;
    }

    public String getResponsibilityname() {
        return responsibilityname;
    }

    public void setResponsibilityname(String responsibilityname) {
        this.responsibilityname = responsibilityname;
    }

    @Override
    public String toString() {
        return "Responsibilities{" +
                "resp_id=" + resp_id +
                ", responsibilityname='" + responsibilityname + '\'' +
                '}';
    }
}
