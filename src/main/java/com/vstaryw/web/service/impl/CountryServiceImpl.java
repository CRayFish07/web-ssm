package main.java.com.vstaryw.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.vstaryw.web.model.Country;
import com.vstaryw.web.service.CountryService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;

/**
 *  @author yuw
 *  @date 2016/03/11
 *  @return
 */
@Service("countryService")
public class CountryServiceImpl extends BaseService<Country> implements CountryService {

    @Override
    public List<Country> selectByCountry(Country country, int page, int rows) {
        Example example = new Example(Country.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotEmpty(country.getCountryname())) {
            criteria.andLike("countryname", "%" + country.getCountryname() + "%");
        }
        if (StringUtil.isNotEmpty(country.getCountrycode())) {
            criteria.andLike("countrycode", "%" + country.getCountrycode() + "%");
        }
        if (country.getId() != null) {
            criteria.andEqualTo("id", country.getId());
        }
        //分页查询
        PageHelper.startPage(page, rows);
        return selectByExample(example);
    }

}
