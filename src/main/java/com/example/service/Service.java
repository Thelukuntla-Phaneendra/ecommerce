package com.example.service;

import com.example.Entity.Orders;
import com.example.Entity.Products;
import java.util.List;

public interface Service {
     List<Products> getAllProducts();
     List<Orders> getAllOrders();
     Products createP(Products products);
     Orders createO(Orders orders);


}
