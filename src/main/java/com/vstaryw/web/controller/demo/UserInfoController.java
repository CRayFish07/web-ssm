package main.java.com.vstaryw.web.controller.demo;

import com.github.pagehelper.Page;
import com.vstaryw.web.mapper.UserInfoMapper;
import com.vstaryw.web.model.UserInfo;
import com.vstaryw.web.service.UserInfoService;
import com.vstaryw.web.util.exception.ProcessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author yuw
 * @time 2016/7/15 16:33
 */
@Controller
@RequestMapping("user")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @Resource
    public UserInfoMapper userInfoMapper;

    @RequestMapping("list")
    @ResponseBody
    public Object getUserList(UserInfo userInfo, @RequestParam("pageNo")int pageNo,@RequestParam(value="pageSize",defaultValue = "10")int pageSize){
        Page<UserInfo> page = (Page<UserInfo>) userInfoService.getUserInfoList(userInfo,pageNo,pageSize);
        return page;
    }

    @RequestMapping("get/{usertype}")
    @ResponseBody
    public Object getUserList(@PathVariable("usertype") String usertype){
        return userInfoService.selectByUsertype(usertype);
    }
    @RequestMapping("get/id/{id}")
    @ResponseBody
    public Object getUserList(@PathVariable("id") Long id) throws ProcessException{
        return userInfoMapper.getUserInfo(id);
    }
}
