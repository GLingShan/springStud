package com.atguigu.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JdbcTempletTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void select(){
        String sql = "select * from user where id = ?";
//        Emp empResult = jdbcTemplate.queryForObject(sql,
//                (rs, rowNum) -> {
//                    Emp emp = new Emp();
//                    emp.setId(rs.getInt("id"));
//                    emp.setName(rs.getString("name"));
//                    emp.setAge(rs.getInt("age"));
//                    emp.setSex(rs.getString("sex"));
//                    return emp;
//                }, 3);
        Emp emp = jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(emp);
    }

    @Test
    public void selectAll() {
        String sql = "select * from user where id";
        List<Emp> emp = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(emp);
    }

    @Test
    public void testUpdate(){
//        据库的添加操作
        //第一步 添加sql语句
        String sql = "insert into user values(3 ,?,?,?)";
        //第二部 调用jdbcTemplate的方法，传入相关参数
        int rows = jdbcTemplate.update(sql, "岳不群", 40, 11);
        System.out.println(rows);
    }

    //查询 返回单个值
    @Test
    public void testSelectValue() {
        String sql = "select count(*) from user";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
    }
}
