package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name="products")
public class Products {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int product_id;

    @Column(name="product_name")
    private String product_name;

    @Column(name="inventory")
    private int inventory;

    public Products() {

    }

    public Products(String name,int count) {
        super();
        this.product_name=name;
        this.inventory=count;
    }

    public void setinventory(int count) {
        this.inventory=count;
    }
    public int getProduct_id()
    {
        return this.product_id;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
