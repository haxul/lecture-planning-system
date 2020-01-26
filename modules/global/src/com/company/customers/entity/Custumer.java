package com.company.customers.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.SearchFolder;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "CUSTOMERS_CUSTUMER")
@Entity(name = "customers_Custumer")
public class Custumer extends StandardEntity {

    private static final long serialVersionUID = -6465505201356924838L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "SURNAME")
    protected String surname;

    @Column
    protected String phone;

    @NotNull
    @Column(name = "EMAIL")
    @Email
    protected String email;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "OREDERS_ID")
    protected List<Order> orders;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Order> getOreders() {
        return orders;
    }

    public void setOreders(List<Order> orders) {
        this.orders = orders;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}