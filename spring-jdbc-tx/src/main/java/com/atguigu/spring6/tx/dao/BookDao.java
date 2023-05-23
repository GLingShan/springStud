package com.atguigu.spring6.tx.dao;

/**
 * ClassName:BookDao
 * Package:com.felix.spring6.tx.dao
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/23 14:26
 * @Version 1.0
 */
public interface BookDao {
    Integer getBookPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateUserBalance(Integer userId, Integer price);
}
