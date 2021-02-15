package com.example.service;

import com.example.Entity.Orders;
import com.example.Entity.Products;
import com.example.exception.ProductNotFound;
import com.example.repository.OrdersRepository;
import com.example.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class ServiceImpl implements Service{
    @Autowired
    private ProductsRepository products;

    @Autowired
    private OrdersRepository orders;

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        @Override
    public List<Products> getAllProducts(){
        return this.products.findAll();
    }

    @Override
    public List<Orders> getAllOrders(){
        return this.orders.findAll();
    }

    @Override
    public Products createP(Products product) {

 if(this.products.findAll().stream().filter(p -> p.getProduct_id()==product.getProduct_id()).count()==1)
        {            int count=product.getInventory();
            for(Products pro :this.products.findAll())
        {if(product.getProduct_id()== pro.getProduct_id())
        {
            pro.setInventory(pro.getInventory()+count);
            return pro;
        }
        }
        }
        return this.products.save(product);
    }
    @Override
    public Orders createO(Orders order)throws ProductNotFound{
        if(this.orders.findAll().stream().filter(p -> p.getProduct_id()==order.getProduct_id()).count()==1)
        {  for(Products pro :this.products.findAll())
        {if(order.getProduct_id()== pro.getProduct_id() && order.getNo_of_orders()<pro.getInventory())
        {pro.setinventory(pro.getInventory()-order.getNo_of_orders());

            return this.orders.save(order);
           }
        else if(order.getProduct_id()== pro.getProduct_id() && order.getNo_of_orders()==pro.getInventory())
        {    this.products.findAll().remove(pro);
            return this.orders.save(order);
        }
        }

        }
       else
        { throw  new ProductNotFound("product not found with id : "+ order.getProduct_id());}
        return order;
    }

}
