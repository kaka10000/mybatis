package com.jeff.mybatis.mapper;

import com.jeff.mybatis.po.RoleResourceExample;
import com.jeff.mybatis.po.RoleResourceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleResourceMapper {
    int countByExample(RoleResourceExample example);

    int deleteByExample(RoleResourceExample example);

    int deleteByPrimaryKey(RoleResourceKey key);

    int insert(RoleResourceKey record);

    int insertSelective(RoleResourceKey record);

    List<RoleResourceKey> selectByExample(RoleResourceExample example);

    int updateByExampleSelective(@Param("record") RoleResourceKey record, @Param("example") RoleResourceExample example);

    int updateByExample(@Param("record") RoleResourceKey record, @Param("example") RoleResourceExample example);
}