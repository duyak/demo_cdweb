package com.laptrinhjavaweb.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "records")
public class Records {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;
    @Column(name = "Type")
    private boolean type;
    @Column(name = "Reason")
    private String reason;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "StaffId")
    private Staffs staffId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Staffs getStaffId() {
        return staffId;
    }

    public void setStaffId(Staffs staffId) {
        this.staffId = staffId;
    }
}
