package com.laptrinhjavaweb.entity;

import javax.persistence.*;

@Entity
@Table(name = "action")
public class Action {

   @javax.persistence.Id
    int Id;
    String Code;
    String Name;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
