package com.example.demo.repo;

import com.example.demo.dto.Purchase;
import com.example.demo.dto.PurchaseResponse;

public interface CheckoutRepository {

    PurchaseResponse placeOrder(Purchase purchase);
}


