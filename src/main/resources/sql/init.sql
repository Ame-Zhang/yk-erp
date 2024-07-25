-- project.yk_user definition

CREATE TABLE `yk_user` (
                           `account` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '账号',
                           `password` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
                           `user_name` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名称',
                           `eamil` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT 'eamil',
                           `remark` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '备注',
                           `create_time` datetime NOT NULL COMMENT '创建时间',
                           `last_update_time` datetime DEFAULT NULL COMMENT '最后更新时间',
                           `last_update_operation` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '最后更新操作',
                           `user_status` varchar(100) NOT NULL COMMENT '用户状态 0-正常 1-禁用',
                           `department` varchar(100) DEFAULT NULL COMMENT '部门',
                           `position` varchar(100) DEFAULT NULL COMMENT '职位',
                           `system_flag` varchar(100) DEFAULT NULL COMMENT '是否系统自带数据 0-是 1-不是',
                           PRIMARY KEY (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;