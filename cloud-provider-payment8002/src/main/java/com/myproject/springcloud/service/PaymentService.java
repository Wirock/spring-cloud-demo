package com.myproject.springcloud.service;

import com.myproject.springcloud.entities.Payment;

/**
 * @author chenzw
 * @date 2021/2/10
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
