package com.luffyjet.gweb;

import com.alibaba.fastjson.JSON;
import com.luffyjet.gweb.mapper.ArticleMapper;
import com.luffyjet.gweb.mapper.UserMapper;
import com.luffyjet.gweb.mapper.WebsitesMapper;
import com.luffyjet.gweb.model.Article;
import com.luffyjet.gweb.model.Websites;
import com.luffyjet.gweb.model.WebsitesExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

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


//        UserMapper articleMapper = session.getMapper(UserMapper.class);
//        List<Article> articles = articleMapper.getUserArticles(1);
//
//        System.out.println(JSON.toJSONString(articles));
//        session.close();

        WebsitesMapper websitesMapper = session.getMapper(WebsitesMapper.class);
//        update(websitesMapper,session);
        query(websitesMapper,session);

//        delete(websitesMapper,session);
//        query(websitesMapper,session);

//        add(websitesMapper, session);
//        query(websitesMapper, session);
    }

    static void query(WebsitesMapper websitesMapper, SqlSession session) {
        WebsitesExample example = new WebsitesExample();
        example.or().andAlexaGreaterThan(20);
        List<Websites> websitesList = websitesMapper.selectByExample(example);
        System.out.println(JSON.toJSONString(websitesList));
//        System.out.println("size: "+websitesMapper.countByExample(null));
        session.close();
    }

    static void add(WebsitesMapper websitesMapper, SqlSession session) {
        Websites websites = new Websites();
        websites.setAlexa(20000);
        websites.setCountry("CN");
        websites.setName("智慧园区");
        websites.setUrl("http://www.wiseyq.com");
        websitesMapper.insert(websites);
        session.commit();
    }

    static void update(WebsitesMapper websitesMapper, SqlSession session) {
        Websites websites = websitesMapper.selectByPrimaryKey(8);
        websites.setName("智慧园区平台");
        websitesMapper.updateByPrimaryKey(websites);
        session.commit();
    }


    static void delete(WebsitesMapper websitesMapper, SqlSession session) {
        websitesMapper.deleteByPrimaryKey(8);
        session.commit();
    }

}
