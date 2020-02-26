package com.appleyk.controller;


import com.appleyk.common.TResult;
import com.appleyk.dao.entity.TUser;
import com.appleyk.service.TUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Appleyk
 * @since 2020-02-26
 */
@RestController
@RequestMapping("/user")
public class TUserController {

    @Autowired
    private TUserService userService;

    /**
     * 分页查询
     * @return
     */
    @GetMapping("/query")
    public TResult query(){
        return TResult.ok(userService.find());
    }

    /**
     * 利用现有MybatisPlus提供的IService里面的接口，根据登录名模糊查询
     * @param name
     * @return
     */
    @GetMapping("/query/{name}")
    public TResult queryByName(@PathVariable("name") String name){
        /*查询包装对象*/
        QueryWrapper wrapper = new QueryWrapper();
        /*构建一个基于name的模糊查询*/
        wrapper.like("name","%"+name+"%");
        return TResult.ok(userService.list(wrapper));
    }

    /**
     * 利用MybatisPlus提供的现有save方法，直接持久化对应的数据实体对象（id生成策略在逆向工程时已经选择全局唯一ID）
     * @param user
     * @return
     */
    @PostMapping("/save")
    public TResult save(@RequestBody TUser user){
        userService.save(user);
        return TResult.ok(user);
    }
}

