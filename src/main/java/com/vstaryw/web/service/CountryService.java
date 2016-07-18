package com.vstaryw.web.service;


import com.vstaryw.web.model.Country;

import java.util.List;

/**
 * @author yuw
 * @since 2016/03/11
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
