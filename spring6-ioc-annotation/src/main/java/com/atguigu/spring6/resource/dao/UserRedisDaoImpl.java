package com.atguigu.spring6.resource.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName:UserRedisDaoImpl
 * Package:com.felix.spring6.autowired.dao
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 17:01
 * @Version 1.0
 */
@Repository("myUserRedisDao")
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao redis.....");
    }
}
