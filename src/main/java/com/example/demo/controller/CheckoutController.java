package com.example.demo.controller;

import com.example.demo.dto.Purchase;
import com.example.demo.dto.PurchaseResponse;
import com.example.demo.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

//the @CrossOrigin("http://localhost:4200") here can't be configured in the myDataRestControllers since
//Whatever Configure there is regarding the Repository   (it implements RepositoryRestConfigurer)
//So if I want to configure the CrossOrigin for the @RestController I will do it in another config file
//@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}









