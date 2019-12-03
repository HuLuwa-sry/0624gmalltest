package com.gmall.gmallcrud.controller;

import com.gmall.gmallcrud.bean.UserInfo;
import com.gmall.gmallcrud.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * company: www.abc.com
 * Author: power
 * Create Data: 2019/12/3
 */
@RestController
@RequestMapping("/user/info")
public class UserInfoController {
    /*
    1.查询
    selectAll();
    select(UserInfo userInfo); 只能等值条件查询！
    selectByExample(Example example); 可以做等值查询，模糊查询！
    selectOne();
     */
    @Autowired
    private UserMapper userMapper;

    @GetMapping("selectAll")
    public List<UserInfo> selectAll(){
        System.out.println("跑通了");
        List<UserInfo> userInfos = userMapper.selectAll();
        return userInfos;
    }


    /**
     * 2.添加
     */

    /**
     * 3.修改
     */


    /**
     * 4.删除
     */
}
