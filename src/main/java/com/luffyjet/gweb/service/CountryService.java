package com.luffyjet.gweb.service;

import com.luffyjet.gweb.model.Country;

import java.util.List;

/**
 * Title :
 * Author : luffyjet
 * Date : 2017/5/18
 * Project : gweb001
 * Site : http://www.luffyjet.com
 */
public interface CountryService extends IService<Country> {
    /**
     * 根据条件分页查询
     *
     * @param country
     * @param page
     * @param rows
     * @return
     */
    List<Country> selectByCountry(Country country, int page, int rows);
}
