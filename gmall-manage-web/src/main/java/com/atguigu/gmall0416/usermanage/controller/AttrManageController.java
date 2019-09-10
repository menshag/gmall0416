package com.atguigu.gmall0416.usermanage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0416.bean.BaseAttrInfo;
import com.atguigu.gmall0416.bean.BaseCatalog1;
import com.atguigu.gmall0416.bean.BaseCatalog2;
import com.atguigu.gmall0416.bean.BaseCatalog3;
import com.atguigu.gmall0416.service.ManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ProjectName: gmall0416
 * @Package: com.atguigu.gmall0416.usermanage.controller
 * @ClassName: AttrManageController
 * @Author: msh520zxb
 * @Description:
 * @Date: 2019/6/26 11:37
 * @Version: 1.0
 */
//平台属性
@Controller
public class AttrManageController {
    @Reference
    private ManageService manageService;



    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> getCatalog1(){
        //调用服务层查询所有数据
        return manageService.getCatalog1();

    }
    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<BaseCatalog2> getCatalog2(String catalog1Id){
        //调用服务层查询所有数据
        return manageService.getCatalog2(catalog1Id);

    }
    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<BaseCatalog3> getCatalog3(String catalog2Id){
        //调用服务层查询所有数据
        return manageService.getCatalog3(catalog2Id);

    }
    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<BaseAttrInfo> attrInfoList(String catalog3Id){
        //调用服务层查询所有数据
        return manageService.getAttrList(catalog3Id);

    }
}
