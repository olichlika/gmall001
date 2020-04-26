package com.kyseng.gmall.user.mapper;

import com.kyseng.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by kingcrum on 2020/4/20.
 */
public interface UserMapper extends Mapper<UmsMember>{

    List<UmsMember> selectAllUser();

}
