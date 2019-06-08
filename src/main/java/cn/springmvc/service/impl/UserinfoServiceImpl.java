package cn.springmvc.service.impl;

import cn.springmvc.dao.UserinfoMapper;
import cn.springmvc.entity.Userinfo;
import cn.springmvc.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserinfoServiceImpl implements UserinfoService {
    @Autowired
    private UserinfoMapper mapper;

    @Override
    public int insert(Userinfo record) {
        return mapper.insert(record);
    }

    @Override
    public int selectSelective(Userinfo record){
        return mapper.insertSelective(record);
    }
}
