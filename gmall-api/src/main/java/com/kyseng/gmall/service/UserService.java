package com.kyseng.gmall.service;

import com.kyseng.gmall.bean.UmsMember;
import com.kyseng.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * Created by kingcrum on 2020/4/20.
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
