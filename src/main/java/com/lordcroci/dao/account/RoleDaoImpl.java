package com.lordcroci.dao.account;

import com.lordcroci.entity.account.Role;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class RoleDaoImpl implements RoleDao
{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    @Transactional
    public Set<Role> findById(Long id)
    {

        List<Role> roles;

        roles = sessionFactory
                .getCurrentSession()
                .createQuery("from Role where id = :id")
                .setParameter("id", id)
                .list();

        if (roles.size() > 0) {
            return new HashSet<>(roles);
        } else {
            return null;
        }

    }

    @Override
    @Transactional
    public void save(Role role)
    {
        sessionFactory.getCurrentSession().save(role);
    }

    @Override
    public List<Role> list()
    {
        @SuppressWarnings("unchecked")
        TypedQuery<Role> query = sessionFactory.getCurrentSession().createQuery("from Role");
        return query.getResultList();
    }
}
