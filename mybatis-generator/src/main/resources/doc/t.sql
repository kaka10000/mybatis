USE mybatis;
/**
    后台用户信息表
*/
CREATE TABLE `t_user` (
  `userid` int(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID主键',
  `username` varchar(60) DEFAULT NULL COMMENT '用户名',
  `password` varchar(128) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台用户信息表';

/**
    角色表
*/
CREATE TABLE `t_role` (
  `roleid` int(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID主键',
  `rolename` varchar(30) DEFAULT NULL COMMENT '角色名',
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

/**
    用户表与角色表的关联表，多对多的关系
*/
CREATE TABLE `t_user_role` (
  `userid` int(20) NOT NULL COMMENT '用户ID',
  `roleid` int(20) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`userid`,`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户与角色的关联表';



/**
    资源表
*/
CREATE TABLE `t_resource` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '资源ID主键',
  `resname` varchar(30) DEFAULT NULL COMMENT '资源名',
  `resurl` varchar(60) DEFAULT NULL COMMENT '资源URL',
  `resdep` int(11) NOT NULL COMMENT '资源深度',
  `parentid` int(20) DEFAULT NULL COMMENT '资源URL的父资源',
  `restype` int(11) NOT NULL COMMENT '资源类型 0-菜单 1-非菜单',
  `resorder` int(11) NOT NULL COMMENT '资源排序',
  `resauth` int(11) NOT NULL COMMENT '资源权限',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源表';



/**
    资源表与角色表的关联表，多对多的关系
*/
CREATE TABLE `t_role_resource` (
  `roleid` int(20) NOT NULL COMMENT '角色ID',
  `resourceid` int(20) NOT NULL COMMENT '资源ID',
  PRIMARY KEY (`roleid`,`resourceid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色与资源的关联表';