package com.cc.usermanage.service.Impl;

import com.cc.common.pojo.User;
import com.cc.usermanage.mapper.UserMapper;
import com.cc.usermanage.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManageImpl implements UserManageService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String queryUser(String id) {
        StringBuilder sb = new StringBuilder();
        try {
            User user = userMapper.queryUser(Integer.valueOf(id));
            if(null != user){
                sb.append(user.getUserId()).append(user.getAddress()).append(user.getName());
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    @Override
    public String addUser(User user) {
        String result = "添加成功";
        try {
            userMapper.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            result = "添加失败";
        }
        return result;
    }

    @Override
    public String updateUser(User user) {
        String result = "修改成功";
        try {
            userMapper.updateUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            result = "修改失败";
        }
        return result;
    }

    @Override
    public String deleteUser(String id) {
        String result = "删除成功";
        try {
            userMapper.deleteUser(Integer.valueOf(id));
        } catch (Exception e) {
            e.printStackTrace();
            result = "删除失败";
        }
        return result;
    }
}
