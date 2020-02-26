package com.appleyk.service.impl;

import com.appleyk.dao.entity.TUser;
import com.appleyk.dao.mapper.TUserMapper;
import com.appleyk.service.TUserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Appleyk
 * @since 2020-02-26
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

    @Autowired
    private TUserMapper userMapper;

    @Override
    public IPage<TUser> find(){
        Page<TUser> page = new Page<>(1,20);
        return userMapper.selectPage(page,null);
    }

}
