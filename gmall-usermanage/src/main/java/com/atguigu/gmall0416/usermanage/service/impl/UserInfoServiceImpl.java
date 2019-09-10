package com.atguigu.gmall0416.usermanage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall0416.bean.UserAddress;
import com.atguigu.gmall0416.bean.UserInfo;
import com.atguigu.gmall0416.service.UserInfoService;
import com.atguigu.gmall0416.usermanage.mapper.UserAddressMapper;
import com.atguigu.gmall0416.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * @ProjectName: gmall0416
 * @Package: com.atguigu.gmall0416.usermanage.service.impl
 * @ClassName: UserInfoServiceImpl
 * @Author: msh520zxb
 * @Description:
 * @Date: 2019/5/31 22:18
 * @Version: 1.easyui
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return userAddressMapper.select(userAddress);
    }


}

