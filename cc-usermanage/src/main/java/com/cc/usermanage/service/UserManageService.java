package com.cc.usermanage.service;

import com.cc.common.pojo.User;

public interface UserManageService {

    String queryUser(String id);

    String addUser(User user);

    String updateUser(User user);

    String deleteUser(String id);
}
