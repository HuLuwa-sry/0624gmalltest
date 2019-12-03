package com.gmall.gmallcrud.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class UserInfo implements Serializable {

    // 以下注解都是通用mapper的
    @Id // 主键
    @Column // 字段
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 获取主键自增！mysql=strategy = GenerationType.IDENTITY oracle=strategy = GenerationType.AUTO
    private String id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private String userLevel;
    //哈哈成功了

}
