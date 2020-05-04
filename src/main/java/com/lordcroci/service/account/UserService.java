package com.lordcroci.service.account;

import com.lordcroci.entity.account.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
