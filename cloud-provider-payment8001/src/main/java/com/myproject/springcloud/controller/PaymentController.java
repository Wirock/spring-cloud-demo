package com.myproject.springcloud.controller;

import com.myproject.springcloud.entities.CommonResult;
import com.myproject.springcloud.entities.Payment;
import com.myproject.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author chenzw
 * @date 2021/2/10
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*******插入结果："+result);
        if(result>0){
            return new CommonResult(200,"插入数据成功！",result);
        }
        return new CommonResult(444,"插入数据失败！");
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******查询结果："+payment);
        if(payment != null){
            return new CommonResult(200,"获取数据成功！",payment);
        }
        return new CommonResult(444,"获取数据失败！");
    }
}
