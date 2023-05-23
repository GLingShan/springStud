package com.atguigu.spring6.tx.controller;


import com.atguigu.spring6.tx.service.BookService;
import com.atguigu.spring6.tx.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName:BookController
 * Package:com.felix.spring6.tx.controller
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/23 14:28
 * @Version 1.0
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    /**
     * 买书的方法:图书id和用户id
     * @param bookId
     * @param userId
     */
    public void buyBook(Integer bookId,Integer userId){
        //调用service方法
        bookService.buyBook(bookId,userId);
    }

    @Autowired
    private CheckoutService checkoutService;

    public void checkout(Integer[] booksId,Integer userId){
        checkoutService.checkout(booksId,userId);
    }
}
