package cn.springmvc.service;

import cn.springmvc.entity.Userinfo;

import java.util.ArrayList;

public interface UserinfoService {
    int insert(Userinfo record);

    int selectSelective(Userinfo record);
}
