package com.lordcroci.dao.expense;

import com.lordcroci.dao.AbstractHibernateDao;
import com.lordcroci.entity.expenseTracker.Expense;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExpenseDaoImpl extends AbstractHibernateDao<Expense> implements ExpenseDao
{
    public ExpenseDaoImpl()
    {
        setClazz(Expense.class);
    }

    @Override
    public List<Expense> findAllByUser(String username)
    {
        List<Object[]> expenses = getCurrentSession().createQuery(

                            "from Expense exp " +
                            "join User u on exp.user.id = u.id " +
                            "where u.username = :username")
                .setParameter("username", username).getResultList();

        List<Expense> eee = new ArrayList<>();
        for (Object[] result : expenses) {
            eee.add((Expense) result[0]);
        }

        return eee != null ? eee : null;
    }
}