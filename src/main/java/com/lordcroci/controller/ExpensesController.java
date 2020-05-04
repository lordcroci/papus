package com.lordcroci.controller;

import com.lordcroci.entity.expenseTracker.Expense;
import com.lordcroci.service.account.SecurityService;
import com.lordcroci.service.expense.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ExpensesController {

    @Autowired
    private ExpenseService expenseService;

    @Autowired
    private SecurityService securityService;

    @RequestMapping(value = "/expCounter", method = RequestMethod.GET)
    public String showExpensesCounter(Model model)
    {
        String userName = securityService.getLoggerUserUsername();
        List<Expense> expenses = expenseService.findAllByUser(userName);
        model.addAttribute("expenses", expenses);
        model.addAttribute("expForm", new Expense());
        return "expenses-counter";
    }

    @RequestMapping(value = "/addExpense", method = RequestMethod.POST)
    public String addExpense(@ModelAttribute("expForm") Expense expense,
        BindingResult result, ModelMap model)
    {
        if(result.hasErrors())
        {
            return "expenses-counter";
        }
        expenseService.save(expense);
        return "expenses-counter";
    }
}
