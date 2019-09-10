package com.atguigu.gmall0416.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ProjectName: gmall0416
 * @Package: com.atguigu.gmall0416.bean
 * @ClassName: BaseAttrInfo
 * @Author: msh520zxb
 * @Description:
 * @Date: 2019/6/26 14:25
 * @Version: 1.0
 */
public class BaseAttrInfo implements Serializable{
    @Id
    @Column
    private String id;
    @Column
    private String attrName;
    @Column
    private String catalog3Id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }
}
