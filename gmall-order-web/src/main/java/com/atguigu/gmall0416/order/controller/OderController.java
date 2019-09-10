package com.atguigu.gmall0416.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0416.bean.UserAddress;
import com.atguigu.gmall0416.service.UserAddressService;
import com.atguigu.gmall0416.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ProjectName: gmall0416
 * @Package: com.atguigu.gmall0416.order.controller
 * @ClassName: OderController
 * @Author: msh520zxb
 * @Description:
 * @Date: 2019/6/3 10:11
 * @Version: 1.easyui
 */


@Controller
public class OderController {
    //在订单项目中，调用usermanage项目中  根据userId查询userAddress方法
//    @Autowired
    @Reference
    private UserInfoService userInfoService;
    @RequestMapping("trade")
    @ResponseBody
    public List<UserAddress> getUserAddress(String userId){
        List<UserAddress> userAddressList = userInfoService.getUserAddressList(userId);
        return userAddressList;
    }




}
