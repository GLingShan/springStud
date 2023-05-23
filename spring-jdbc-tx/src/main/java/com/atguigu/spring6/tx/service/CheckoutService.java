package com.atguigu.spring6.tx.service;

/**
 * ClassName:CheckoutService
 * Package:com.felix.spring6.tx.service
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/23 16:19
 * @Version 1.0
 */
public interface CheckoutService {
    //买多本书的方法发
    void checkout(Integer[] bookIds,Integer userId);
}
