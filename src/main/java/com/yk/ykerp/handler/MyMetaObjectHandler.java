package com.yk.ykerp.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author KANG
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private static final String CREATE_TIME = "createTime";
    private static final String LAST_UPDATE_TIME = "lastUpdateTime";

    @Override
    public void insertFill(MetaObject metaObject) {
        LocalDateTime now = LocalDateTime.now();
        if (metaObject.hasSetter(CREATE_TIME)) {
            this.setFieldValByName(CREATE_TIME, now, metaObject);
        }
        if (metaObject.hasSetter(LAST_UPDATE_TIME)) {
            this.setFieldValByName(LAST_UPDATE_TIME, now, metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if (metaObject.hasSetter(LAST_UPDATE_TIME)) {
            LocalDateTime now = LocalDateTime.now();
            this.setFieldValByName(LAST_UPDATE_TIME, now, metaObject);
        }
    }
}
