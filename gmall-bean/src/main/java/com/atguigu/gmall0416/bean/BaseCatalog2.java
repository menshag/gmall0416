package com.atguigu.gmall0416.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ProjectName: gmall0416
 * @Package: com.atguigu.gmall0416.bean
 * @ClassName: BaseCatalog2
 * @Author: msh520zxb
 * @Description:
 * @Date: 2019/6/26 14:18
 * @Version: 1.0
 */
public class BaseCatalog2 implements Serializable {

    @Id
    @Column
    private String id;
    @Column
    private String name;
    @Column
    private String catalog1Id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(String catalog1Id) {
        this.catalog1Id = catalog1Id;
    }
}
