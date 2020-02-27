package com.appleyk.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *   用户数据实体类 -- mybatisplus 逆向工程生成的代码，稍加改造
 * </p>
 *
 * @author Appleyk
 * @since 2020-02-26
 */
@Data
public class TUser implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    private String name;

    private String password;

    private Date createTime ;

    public TUser(){
       this.createTime = new Date();
    }

    @Override
    public String toString() {
        return "TUser{" +
        "id=" + id +
        ", name=" + name +
        ", password=" + password +
        ", createTime=" + createTime +
        "}";
    }
}
