package com.example.controller;

import com.example.Entity.Orders;
import com.example.Entity.Products;
import com.example.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ecommerce")
public class UserController {

    @Autowired
    private ServiceImpl products;



    @GetMapping/*("/product")*/
    public List<Products> getAllProducts(){
        return this.products.getAllProducts();
    }

   /* @GetMapping("/order")
    public List<Orders> getAllOrders(){
        return this.products.getAllOrders();
    }*/

    @PostMapping/*("/product")*/
    public Products createProduct(@RequestBody Products product){

        return this.products.createP(product);
    }

  /*  @PostMapping("/order")
    public Orders PlaceOrder(@RequestBody Orders orders){
        return this.products.createO(orders);
    }*/

}
