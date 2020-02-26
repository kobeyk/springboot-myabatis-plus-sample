package com.appleyk.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *  用户详细信息数据实体类 -- mybaitsplus 逆向工程生成的代码，稍加改造
 * </p>
 *
 * @author Appleyk
 * @since 2020-02-26
 */
@Data
public class TUserInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    private Long uid;

    private String name;

    private Integer gender;

    private Integer age;

    private String address;

    @Override
    public String toString() {
        return "TUserInfo{" +
        "id=" + id +
        ", uid=" + uid +
        ", name=" + name +
        ", gender=" + gender +
        ", age=" + age +
        ", address=" + address +
        "}";
    }
}
