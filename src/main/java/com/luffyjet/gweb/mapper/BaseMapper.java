package com.luffyjet.gweb.mapper;

import com.luffyjet.gweb.model.Country;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Title :
 * Author : luffyjet
 * Date : 2017/5/18
 * Project : gweb001
 * Site : http://www.luffyjet.com
 */
public interface BaseMapper<T> {

    int countByExample(Object example);


    int deleteByExample(Object example);


    int deleteByPrimaryKey(Integer id);


    int insert(T record);


    int insertSelective(T record);


    List<T> selectByExample(Object example);


    T selectByPrimaryKey(Integer id);


    int updateByExampleSelective(@Param("record") T record, @Param("example") Object example);


    int updateByExample(@Param("record") T record, @Param("example") Object example);


    int updateByPrimaryKeySelective(T record);


    int updateByPrimaryKey(T record);
}
