package com.company.customers.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.security.entity.SearchFolder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "CUSTOMERS_ORDER")
@Entity(name = "customers_Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 6920387546757373027L;


    @Temporal(TemporalType.DATE)
    @Column(name = "DATE")
    protected Date date;

    @Column(name = "AMOUT")
    protected BigDecimal amout;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @OnDelete(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Custumer customer;

    public Custumer getCustomer() {
        return customer;
    }

    public void setCustomer(Custumer customer) {
        this.customer = customer;
    }

    public BigDecimal getAmout() {
        return amout;
    }

    public void setAmout(BigDecimal amout) {
        this.amout = amout;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}