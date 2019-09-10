package com.atguigu.gmall0416.usermanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: gmall0416
 * @Package: com.atguigu.gmall0416.usermanage.controller
 * @ClassName: ManageController
 * @Author: msh520zxb
 * @Description:
 * @Date: 2019/6/12 22:51
 * @Version: 1.easyui
 */
@Controller
public class ManageController {
    @RequestMapping("index")
    public String index(){
        return  "index";
    }
    @RequestMapping("attrListPage")
    public String attrListPage(){
        return "attrListPage";
    }
}
