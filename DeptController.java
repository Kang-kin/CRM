package com.kang.controller;

import com.kang.pojo.Dept;
import com.kang.pojo.Msg;
import com.kang.servlet.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
*@Description
*@Date 21:56 2020/9/15
*@Param  处理和部门有关的
*@return
**/
@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @ResponseBody
    @RequestMapping("/depts")
    public Msg getDepts(){
        //查出所有部门的信息
       List<Dept> list=deptService.getDepts();
       return  Msg.success().add("depts",list);
    }


}
