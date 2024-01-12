package com.platzi_market.domain;

import java.time.LocalDateTime;
import java.util.List;

public class BuysModel {

    private Integer idBuys;
    private String idCustomer;
    private LocalDateTime date;
    private String paymentMethod;
    private String comments;
    private String state;
    private List<BuysProductModel> products;

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

    public List<BuysProductModel> getProducts() {
        return products;
    }

    public void setProducts(List<BuysProductModel> products) {
        this.products = products;
    }
}
