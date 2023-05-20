package com.atguigu.spring6.iocxml.auto.service;


import com.atguigu.spring6.iocxml.auto.dao.UserDao;
import com.atguigu.spring6.iocxml.auto.dao.UserDaoImpl;

/**
 * ClassName:UserServiceImpl
 * Package:com.felix.spring6.iocxml.auto.service
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 14:33
 * @Version 1.0
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDaoImpl) {
        this.userDao = userDaoImpl;
    }

    @Override
    public void addUserService() {
        System.out.println("userService的方法执行了");
        userDao.addUserDao();
//        UserDao userDao=new UserDaoImpl();
//        userDao.addUserDao();
    }
}
