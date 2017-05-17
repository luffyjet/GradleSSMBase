package com.luffyjet.gweb.controller;

import com.alibaba.fastjson.JSON;
import com.luffyjet.gweb.mapper.UserMapper;
import com.luffyjet.gweb.model.Article;
import com.luffyjet.gweb.model.BaseResult;
import com.luffyjet.gweb.model.User;
import com.luffyjet.gweb.model.UserExample;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Title :
 * Author : luffyjet
 * Date : 2017/5/12
 * Project : gweb001
 * Site : http://www.luffyjet.com
 */
@RestController
public class DemoController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(
            value = "/userInfo/{name}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getUserInfo(@PathVariable("name") String name) {
        UserExample example = new UserExample();
        example.or().andUsernameLike("%" + name + "%");
        List<User> userList = userMapper.selectByExample(example);
        if (userList.size() == 0) {
            return new BaseResult(false, "当前用户不存在").toJSON();
        }
        return new BaseResult(userList.get(0)).toJSON();
    }

    @RequestMapping(
            value = "/userArticles/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getArticlesByUserId(@PathVariable("id") int id) {
        List<Article> articles = userMapper.getUserArticles(id);
        if (articles.size() == 0) {
            return new BaseResult(false, "当前用户没有文章").toJSON();
        }
        return new BaseResult(articles).toJSON();
    }
}
