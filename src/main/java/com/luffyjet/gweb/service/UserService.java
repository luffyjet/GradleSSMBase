package com.luffyjet.gweb.service;

import com.luffyjet.gweb.model.User;

import java.util.List;


/**
 * Title :
 * Author : luffyjet
 * Date : 2017/5/17
 * Project : gweb001
 * Site : http://www.luffyjet.com
 */
public interface UserService {
    void save(User user);
    int update(User user);
    int delete(int id);
    User findById(int id);
    List<User> findAll();
}
