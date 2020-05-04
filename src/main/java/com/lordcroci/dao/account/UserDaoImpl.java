package com.lordcroci.dao.account;

import com.lordcroci.entity.account.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao
{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    @Transactional
    public User findByUsername(String username)
    {

        List<User> users;

        users = sessionFactory.getCurrentSession()
                .createQuery("from User where username = :username")
                .setParameter("username", username)
                .list();

        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }

    }

    @Override
    @Transactional
    public void save(User user)
    {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public List<User> list()
    {
        @SuppressWarnings("unchecked")
        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
        return query.getResultList();
    }
}
