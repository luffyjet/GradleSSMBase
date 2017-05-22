package com.luffyjet.gweb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.luffyjet.gweb.model.Country;
import com.luffyjet.gweb.model.CountryExample;
import com.luffyjet.gweb.service.BaseService;
import com.luffyjet.gweb.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title :
 * Author : luffyjet
 * Date : 2017/5/18
 * Project : gweb001
 * Site : http://www.luffyjet.com
 */
@Service("countryService")
public class CountryServiceImpl extends BaseService<Country> implements CountryService {
    @Override
    public List<Country> selectByCountry(Country country, int page, int rows) {
        CountryExample example = new CountryExample();
        CountryExample.Criteria criteria = example.createCriteria();
//        if (StringUtil.isNotEmpty(country.getCountryname())) {
//            criteria.andCountrynameLike("%" + country.getCountryname() + "%");
//        }
//        if (StringUtil.isNotEmpty(country.getCountrycode())) {
//            criteria.andCountrycodeLike("%" + country.getCountrycode() + "%");
//        }
//        if (country.getId() != null) {
//            criteria.andIdEqualTo(country.getId());
//        }
        //分页查询
        PageHelper.startPage(page, rows);
        return selectByExample(example);
    }

}
