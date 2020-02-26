package com.appleyk.service;

import com.appleyk.dao.entity.TUser;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Appleyk
 * @since 2020-02-26
 */
public interface TUserService extends IService<TUser> {
    IPage<TUser> find();
}
