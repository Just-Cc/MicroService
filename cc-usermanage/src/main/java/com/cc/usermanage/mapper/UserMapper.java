package com.cc.usermanage.mapper;

import com.cc.common.pojo.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    User queryUser(Integer id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);
}
