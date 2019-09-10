package com.atguigu.gmall0416.service;

import com.atguigu.gmall0416.bean.BaseAttrInfo;
import com.atguigu.gmall0416.bean.BaseCatalog1;
import com.atguigu.gmall0416.bean.BaseCatalog2;
import com.atguigu.gmall0416.bean.BaseCatalog3;

import java.util.List;

/**
 * @ProjectName: gmall0416
 * @Package: com.atguigu.gmall0416.service
 * @ClassName: ManageService
 * @Author: msh520zxb
 * @Description:
 * @Date: 2019/6/29 22:16
 * @Version: 1.0
 */
public interface ManageService {
    //查询所有的一级分类
    List<BaseCatalog1> getCatalog1();
    //根据一级分类Id查询二级分类
    List<BaseCatalog2> getCatalog2(String catalog1Id);
    //根据二级分类Id查询三级分类
    List<BaseCatalog3> getCatalog3(String catalog2Id);
    //根据三级分类Id查询平台属性
    List<BaseAttrInfo> getAttrList(String catalog3Id);

}
