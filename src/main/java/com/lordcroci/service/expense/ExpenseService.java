package com.lordcroci.service.expense;

import com.lordcroci.entity.expenseTracker.Expense;

import java.util.List;

public interface ExpenseService
{
    public Expense findByID(Long id);

    public List<Expense> findAll();

    public void save(Expense entity);

    public Expense update(Expense entity);

    public void delete(Expense entity);

    public void deleteById(Long id);

    public List<Expense> findAllByUser(String username);
}
