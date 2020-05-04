package com.lordcroci.dao.account;

import com.lordcroci.entity.account.User;

import java.util.List;

public interface UserDao {

    User findByUsername(String username);

    void save(User user);

    List<User> list();
}