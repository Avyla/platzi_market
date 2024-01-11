package com.platzi_market.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "shopping_products")
public class BuysProduct {
    @EmbeddedId
    private BuysProductPK id;
    private Integer amount;
    private Double total;
    private Boolean state;
    @ManyToOne
    @JoinColumn(name = "id_buys", insertable = false, updatable = false)
    private Buys buys;
    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private Product product;

    public BuysProductPK getId() {
        return id;
    }

    public void setId(BuysProductPK id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
