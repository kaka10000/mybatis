INSERT INTO `mybatis`.`t_user` (`userid`, `username`, `password`) VALUES ('1', 'jack', 'aaa'); 
INSERT INTO `mybatis`.`t_user` (`userid`, `username`, `password`) VALUES ('2', 'bob', 'bbb'); 
INSERT INTO `mybatis`.`t_user` (`userid`, `username`, `password`) VALUES ('3', 'alice', 'ccc');

INSERT INTO `mybatis`.`t_role` (`roleid`, `rolename`) VALUES ('1', 'admin'); 
INSERT INTO `mybatis`.`t_role` (`roleid`, `rolename`) VALUES ('2', 'manager'); 
INSERT INTO `mybatis`.`t_role` (`roleid`, `rolename`) VALUES ('3', 'delevop'); 
INSERT INTO `mybatis`.`t_role` (`roleid`, `rolename`) VALUES ('4', 'qa');

INSERT INTO `mybatis`.`t_user_role` (`userid`, `roleid`) VALUES ('1', '1'); 
INSERT INTO `mybatis`.`t_user_role` (`userid`, `roleid`) VALUES ('2', '2'); 
INSERT INTO `mybatis`.`t_user_role` (`userid`, `roleid`) VALUES ('3', '3'); 
INSERT INTO `mybatis`.`t_user_role` (`userid`, `roleid`) VALUES ('4', '4'); 
INSERT INTO `mybatis`.`t_user_role` (`userid`, `roleid`) VALUES ('5', '3'); 
INSERT INTO `mybatis`.`t_user_role` (`userid`, `roleid`) VALUES ('6', '3'); 

INSERT INTO `mybatis`.`t_resource` (`id`, `resname`, `resurl`, `resdep`, `parentid`, `restype`, `resorder`, `resauth`) VALUES ('1', '查看用户', '/user/find', '0', '0', '0', '1', '1'); 
INSERT INTO `mybatis`.`t_resource` (`id`, `resname`, `resurl`, `resdep`, `parentid`, `restype`, `resorder`, `resauth`) VALUES ('2', '删除用户', '/user/delete', '0', '0', '1', '0', '1'); 
INSERT INTO `mybatis`.`t_resource` (`id`, `resname`, `resdep`, `parentid`, `restype`, `resorder`, `resauth`) VALUES ('3', '查看用户目录', '1', '0', '0', '1', '1'); 


INSERT INTO `mybatis`.`t_role_resource` (`roleid`, `resourceid`) VALUES ('1', '1'); 
INSERT INTO `mybatis`.`t_role_resource` (`roleid`, `resourceid`) VALUES ('1', '2'); 
INSERT INTO `mybatis`.`t_role_resource` (`roleid`, `resourceid`) VALUES ('1', '3'); 
INSERT INTO `mybatis`.`t_role_resource` (`roleid`, `resourceid`) VALUES ('2', '1'); 
INSERT INTO `mybatis`.`t_role_resource` (`roleid`, `resourceid`) VALUES ('2', '2'); 
INSERT INTO `mybatis`.`t_role_resource` (`roleid`, `resourceid`) VALUES ('3', '1'); 
INSERT INTO `mybatis`.`t_role_resource` (`roleid`, `resourceid`) VALUES ('4', '1');