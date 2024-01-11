package com.platzi_market.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customers")
public class CustomerEntity {
    @Id
    @Column(name = "id_customer")
    private String idCustomer;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private Double cellphone;
    private String address;
    private String email;
    @OneToMany(mappedBy = "customer")
    private List<BuysEntity> shopping;

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getCellphone() {
        return cellphone;
    }

    public void setCellphone(Double cellphone) {
        this.cellphone = cellphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BuysEntity> getShopping() {
        return shopping;
    }

    public void setShopping(List<BuysEntity> shopping) {
        this.shopping = shopping;
    }
}
