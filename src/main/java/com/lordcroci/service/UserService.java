package com.lordcroci.service;

import com.lordcroci.entity.account.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
