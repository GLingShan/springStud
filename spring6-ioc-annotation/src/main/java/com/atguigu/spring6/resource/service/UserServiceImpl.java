package com.atguigu.spring6.resource.service;


import com.atguigu.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserServiceImpl
 * Package:com.felix.spring6.autowired.service
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 15:48
 * @Version 1.0
 */
@Service("myUserService")
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("service....");
        myUserRedisDao.add();
    }
    //不指定名称 根据属性名称注入
    @Resource()
    private UserDao myUserRedisDao;
}
