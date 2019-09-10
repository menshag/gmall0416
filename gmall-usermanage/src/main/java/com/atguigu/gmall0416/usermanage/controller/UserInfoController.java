package com.atguigu.gmall0416.usermanage.controller;

import com.atguigu.gmall0416.bean.UserInfo;
import com.atguigu.gmall0416.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * @ProjectName: gmall0416
 * @Package: com.atguigu.gmall0416.usermanage.controller
 * @ClassName: UserInfoController
 * @Author: msh520zxb
 * @Description:
 * @Date: 2019/5/31 22:30
 * @Version: 1.easyui
 */
@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
//    @ResponseBody:返回Json字符串，将数据显示在页面上
    @RequestMapping("findAll")
    @ResponseBody
    public List<UserInfo> getAll(){
      return userInfoService.findAll();
    }

    /*
    bean：实体类
    interface:接口 -除了mapper,mapper放在当前的项目之中
    common  -web service
    web:搭建页面项目的时候使用
    service:搭建项目后台服务时需要使用
     */

}
