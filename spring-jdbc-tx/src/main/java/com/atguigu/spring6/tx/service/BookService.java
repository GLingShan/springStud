package com.atguigu.spring6.tx.service;

/**
 * ClassName:BookService
 * Package:com.felix.spring6.tx.service
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/23 14:26
 * @Version 1.0
 */
public interface BookService {
    void buyBook(Integer bookId, Integer userId);
}
