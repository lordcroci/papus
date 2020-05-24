package com.lordcroci.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractHibernateDao<T extends Serializable>
{
    private Class<T> clazz;

   @Autowired
    SessionFactory sessionFactory;

    public void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T findOne(Long id)
    {
    return (T) getCurrentSession().get(clazz, id);
    }

    public List<T> findAll()
    {
        return getCurrentSession().createQuery("from " + clazz.getName()).list();
    }

    public void save(T entity)
    {
            getCurrentSession().persist(entity);
    }

    public T update(T entity)
    {
        return (T) getCurrentSession().merge(entity);
    }

    public void delete(T entity)
    {
        getCurrentSession().delete(entity);
    }

    public void deleteById(Long id)
    {
        final T entity = findOne(id);
        delete(entity);
    }
    protected final Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}
