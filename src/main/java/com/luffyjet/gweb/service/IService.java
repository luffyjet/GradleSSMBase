package com.luffyjet.gweb.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title :
 * Author : luffyjet
 * Date : 2017/5/18
 * Project : gweb001
 * Site : http://www.luffyjet.com
 */
@Service
public interface IService<T> {
    T selectByKey(Integer key);

    int save(T entity);

    int delete(Integer key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);
}
