package com.atguigu.gmall0416.service;

import com.atguigu.gmall0416.bean.UserAddress;
import com.atguigu.gmall0416.bean.UserInfo;

import java.util.List;

/**
 * @ProjectName: gmall0416
 * @Package: com.atguigu.gmall0416.service
 * @ClassName: UserInfoService
 * @Author: msh520zxb
 * @Description:
 * @Date: 2019/5/31 easyui:41
 * @Version: 1.easyui
 */
public interface UserInfoService {
    List<UserInfo> findAll();
//    根据UserId查询用户地址列表
    List<UserAddress> getUserAddressList(String userId);
}
