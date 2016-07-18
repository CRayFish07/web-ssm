package com.vstaryw.web.service;

import com.vstaryw.web.model.UserInfo;

import java.util.List;

/**
 * @author yuw
 * @time 2016/7/15 16:35
 */
public interface UserInfoService extends IService<UserInfo>{

    public List<UserInfo> getUserInfoList(UserInfo userInfo, int pageNo, int pageSize);

    public List<UserInfo> selectByUsertype(String userType);
}
