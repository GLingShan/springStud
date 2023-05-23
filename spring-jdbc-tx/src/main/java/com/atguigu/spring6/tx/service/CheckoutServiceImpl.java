package com.atguigu.spring6.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:CheckoutServiceImpl
 * Package:com.felix.spring6.tx.service
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/23 16:20
 * @Version 1.0
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private BookService bookService;

    //买多本书的方法
    @Override
    @Transactional
    //一次购买多本图书
    public void checkout(Integer[] bookIds, Integer userId) {
        for (Integer bookId : bookIds) {
            bookService.buyBook(bookId, userId);
        }
    }
}
