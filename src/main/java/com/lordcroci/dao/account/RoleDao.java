package com.lordcroci.dao.account;

import com.lordcroci.entity.account.Role;

import java.util.List;
import java.util.Set;

public interface RoleDao
{
    Set<Role> findById(Long id);

    void save(Role role);

    List<Role> list();
}
