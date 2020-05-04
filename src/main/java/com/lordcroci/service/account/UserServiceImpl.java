package com.lordcroci.service.account;

import com.lordcroci.dao.account.RoleDao;
import com.lordcroci.dao.account.UserDao;
import com.lordcroci.entity.account.Role;
import com.lordcroci.entity.account.User;
import com.lordcroci.service.account.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService
{
    static final Long ROLE_USER = 20L;

    @Autowired
    private UserDao userRepository;

    @Autowired
    private RoleDao roleRepository;

    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<Role>(roleRepository.findById(ROLE_USER)));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {

        return userRepository.findByUsername(username);
    }
}