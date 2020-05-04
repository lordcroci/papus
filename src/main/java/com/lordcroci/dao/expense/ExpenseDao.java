package com.lordcroci.dao.expense;


import com.lordcroci.entity.expenseTracker.Expense;

import java.util.List;

public interface ExpenseDao
{
    public Expense findOne(Long id);

    public List<Expense> findAll();

    public void save(Expense entity);

    public Expense update(Expense entity);

    public void delete(Expense entity);

    public void deleteById(Long id);

    public List<Expense> findAllByUser(String username);
}
