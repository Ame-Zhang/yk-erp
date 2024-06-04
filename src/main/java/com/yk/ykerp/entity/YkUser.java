package com.yk.ykerp.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * (YkUser)表实体类
 *
 * @author makejava
 * @since 2024-06-04 15:49:08
 */
@Data
@Accessors(chain = true)
@TableName("yk_user")
public class YkUser extends BaseEntity{

    @TableId
    private Integer id;
    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * eamil
     */
    private String eamil;

    /**
     * 备注
     */
    private String remark;
}

