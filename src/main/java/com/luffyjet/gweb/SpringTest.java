package com.luffyjet.gweb;

import com.alibaba.fastjson.JSON;
import com.luffyjet.gweb.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Title :
 * Author : luffyjet
 * Date : 2017/5/17
 * Project : gweb001
 * Site : http://www.luffyjet.com
 */
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring/spring-common.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);
        System.out.println(JSON.toJSONString(userMapper.selectByExample(null)));
    }
}
