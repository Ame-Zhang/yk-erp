package com.yk.ykerp.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.yk.ykerp.entity.YkUser;

/**
 * (YkUser)表数据库访问层
 *
 * @author makejava
 * @since 2024-06-04 15:49:06
 */
@Mapper
public interface YkUserDao extends BaseMapper<YkUser> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<YkUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<YkUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<YkUser> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<YkUser> entities);

}

