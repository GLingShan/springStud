package com.atguigu.spring6.tx.service;


import com.atguigu.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:BookServiceImpl
 * Package:com.felix.spring6.tx.service
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/23 14:26
 * @Version 1.0
 */
@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    /**
     * 买书的方法:图书id和用户id
     * @param bookId
     * @param userId
     */
    @Override
    public void buyBook(Integer bookId, Integer userId) {
        //根据图书id查询图书价格
        Integer price = bookDao.getBookPriceByBookId(bookId);

        //更新图书表库存量 -1
        bookDao.updateStock(bookId);

        //更新用户表用户余额 - 图书价格
        bookDao.updateUserBalance(userId,price);

    }
}
