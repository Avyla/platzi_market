package com.platzi_market.persistence.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "shopping")
public class Buys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_buys")
    private Integer idBuys;
    @Column(name = "id_customer")
    private String idCustomer;
    private LocalDateTime date;
    @Column(name = "payment_method")
    private String paymentMethod;
    private String comments;
    private String state;

    public Integer getIdBuys() {
        return idBuys;
    }

    public void setIdBuys(Integer idBuys) {
        this.idBuys = idBuys;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
