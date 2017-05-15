package com.luffyjet.gweb;

import com.alibaba.fastjson.JSON;
import com.luffyjet.gweb.mapper.WebsitesMapper;
import com.luffyjet.gweb.model.Websites;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Title :
 * Author : luffyjet
 * Date : 2017/5/15
 * Project : gweb001
 * Site : http://www.luffyjet.com
 */
public class SqlTest {
    public static void main(String[] args) throws IOException {
        String resource = "config/mybatis/config.xml";
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();

       WebsitesMapper websitesMapper = session.getMapper(WebsitesMapper.class);
        Websites websites = websitesMapper.selectByPrimaryKey(1);
        System.out.println(JSON.toJSONString(websites));
    }
}
