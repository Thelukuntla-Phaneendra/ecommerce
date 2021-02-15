package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity
@Table(name="orders")
public class Orders {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int  id;

    @Column(name="product_id")
    private int product_id;

    @Column(name="product_name")
    private String product_name;

    @Column(name="no_of_orders")
    private int no_of_orders;

    public Orders() {

    }

    public Orders(int id,String name,int count) {
        this.product_id=id;
        this.product_name=name;
        this.no_of_orders=count;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public int getNo_of_orders() {
        return no_of_orders;
    }
}
