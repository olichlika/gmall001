package com.kyseng.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kyseng.gmall.bean.UmsMember;
import com.kyseng.gmall.bean.UmsMemberReceiveAddress;
import com.kyseng.gmall.service.UserService;
import com.kyseng.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.kyseng.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by kingcrum on 2020/4/20.
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAll();//userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
//        Example e = new Example(UmsMemberReceiveAddress.class);
//
//        e.createCriteria().andEqualTo("memberId", memberId);
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);

        //List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(umsMemberReceiveAddress);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

        return umsMemberReceiveAddresses;
    }
}
