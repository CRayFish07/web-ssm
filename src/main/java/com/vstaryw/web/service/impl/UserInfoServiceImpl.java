package main.java.com.vstaryw.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.vstaryw.web.model.UserInfo;
import com.vstaryw.web.service.UserInfoService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;

/**
 * @author yuw
 * @time 2016/7/15 16:42
 */
@Service("userInfoService")
public class UserInfoServiceImpl extends BaseService<UserInfo> implements UserInfoService{

    @Override
    public List<UserInfo> getUserInfoList(UserInfo userInfo, int pageNo, int pageSize) {
        Example example = new Example(UserInfo.class);
        Example.Criteria criteria = example.createCriteria();
        PageHelper.startPage(pageNo,pageSize);
        return selectByExample(example);
    }

    @Override
    public List<UserInfo> selectByUsertype(String userType) {
        Example example = new Example(UserInfo.class);
        Example.Criteria criteria =example.createCriteria();
        if(StringUtil.isNotEmpty(userType)){
            criteria.andEqualTo("usertype",userType);
        }
        return selectByExample(example);
    }
}
