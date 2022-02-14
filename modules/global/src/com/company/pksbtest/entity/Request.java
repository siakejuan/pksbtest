package com.company.pksbtest.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "PKSBTEST_REQUEST")
@Entity(name = "pksbtest_Request")
@NamePattern("%s|status")
public class Request extends StandardEntity {
    private static final long serialVersionUID = 4329595455514479071L;

    @Column(name = "CUSTOMER")
    private String customer;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_")
    private Date date;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "TICKET_NUMBER")
    private String ticketNumber;

    @Column(name = "STATUS")
    private String status;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "requestStorage")
    private List<RequestStorageLine> requestStorageLine;

    public List<RequestStorageLine> getRequestStorageLine() {
        return requestStorageLine;
    }

    public void setRequestStorageLine(List<RequestStorageLine> requestStorageLine) {
        this.requestStorageLine = requestStorageLine;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}