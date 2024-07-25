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
     * 职位
     */
    private String position;

    /**
     * 部门
     */
    private String department;

    /**
     * 用户状态
     */
    private String userStatus;

    /**
     * 是否系统自带数据
     */
    private String systemFlag;

    /**
     * 备注
     */
    private String remark;
}

