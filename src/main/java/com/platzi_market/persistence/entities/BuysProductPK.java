package com.platzi_market.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class BuysProductPK implements Serializable {
    @Column(name = "id_buys")
    private Integer idBuys;
    @Column(name = "id_product")
    private Integer idProduct;

    public Integer getIdBuys() {
        return idBuys;
    }

    public void setIdBuys(Integer idBuys) {
        this.idBuys = idBuys;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

}
