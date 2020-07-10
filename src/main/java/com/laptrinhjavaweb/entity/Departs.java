package com.laptrinhjavaweb.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "departs")
public class Departs {
    @Id
    @Column(name = "Id")
    private String id;
    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "departId",fetch = FetchType.EAGER)
    private Collection<Staffs> staffs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
