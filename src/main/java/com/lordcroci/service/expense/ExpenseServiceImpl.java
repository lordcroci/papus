package com.lordcroci.service.expense;

import com.lordcroci.dao.expense.ExpenseDao;
import com.lordcroci.entity.expenseTracker.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.QueryHint;
import java.util.List;

@Service
@Transactional
public class ExpenseServiceImpl implements ExpenseService
{
    @Autowired
    private ExpenseDao expenseDao;

    public Expense findByID(Long id)
    {
        return expenseDao.findOne(id);
    }

    public List<Expense> findAll()
    {
        return expenseDao.findAll();
    }

    public void save(Expense entity)
    {
        expenseDao.save(entity);
    }

    public Expense update(Expense entity)
    {
        return expenseDao.update(entity);
    }

    public void delete(Expense entity)
    {
        expenseDao.delete(entity);
    }

    public void deleteById(Long id)
    {
        expenseDao.deleteById(id);
    }

    public List<Expense> findAllByUser(String username)
    {
        return expenseDao.findAllByUser(username);
    }
}
