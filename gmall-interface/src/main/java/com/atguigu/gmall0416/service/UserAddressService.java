package com.atguigu.gmall0416.service;

import com.atguigu.gmall0416.bean.UserAddress;

import java.util.List;

/**
 * @ProjectName: gmall0416
 * @Package: com.atguigu.gmall0416.service
 * @ClassName: UserAddressService
 * @Author: msh520zxb
 * @Description: 添加接口UserAddressService
 * @Date: 2019/6/2 19:14
 * @Version: 1.easyui
 */
public interface UserAddressService {
    List<UserAddress> findByUserId(String userId);




}
