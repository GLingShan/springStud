package com.atguigu.spring6.tx;

import com.atguigu.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName:BookTxTest
 * Package:com.felix.spring6.tx
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/23 14:55
 * @Version 1.0
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class BookTxTest {

    @Autowired
    private BookController controller;

    @Test
    public void test() {
//        controller.buyBook(1, 1);
        Integer[] booksId={1,2};
        controller.checkout(booksId,1);
    }
}
