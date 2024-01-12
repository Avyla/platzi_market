package com.platzi_market.persistence.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Integer idProduct;
    private String name;
    @Column(name = "id_category")
    private Integer idCategory;
    private String barcode;
    private Double price;
    private Integer stock;
    private Boolean state;

    /*Con la anotacio @ManyToOne se refleja muchos a uno en la tabla sql
    y la anotacion @JoinColumn refleja el campo mendiante el cual se
    crea esta relacion
    insertable =  false impide que se creen nuevas categorias desde esta relacion
    updatable = false impide que se hagan actualizacion en la tabla categories desde esta relacion*/

    @ManyToOne
    @JoinColumn(name = "id_category", insertable = false, updatable = false)
    private CategoryEntity categoryEntity;

    @OneToMany(mappedBy = "productEntity")
    private List<BuysProductEntity> buysProductEntities;

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

}
