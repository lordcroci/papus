package com.lordcroci.service.expense;

import com.lordcroci.dao.account.UserDao;
import com.lordcroci.dao.expense.ExpenseDao;
import com.lordcroci.entity.account.User;
import com.lordcroci.entity.expenseTracker.Expense;
import com.lordcroci.service.account.SecurityService;
import com.lordcroci.service.account.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExpenseServiceImpl implements ExpenseService
{
    @Autowired
    private ExpenseDao expenseDao;

    @Autowired
    private UserService userService;

    @Autowired
    SecurityService securityService;

    @Autowired
    private UserDao userDao;

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
        User currentUser = userService.findByUsername(securityService.getLoggedUserUsername());
        entity.setUser(currentUser);
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
