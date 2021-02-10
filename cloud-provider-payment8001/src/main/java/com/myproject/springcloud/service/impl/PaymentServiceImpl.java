package com.myproject.springcloud.service.impl;

import com.myproject.springcloud.dao.PaymentDao;
import com.myproject.springcloud.entities.Payment;
import com.myproject.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chenzw
 * @date 2021/2/10
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
