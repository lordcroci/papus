package com.lordcroci.controller;

import com.lordcroci.entity.expenseTracker.Expense;
import com.lordcroci.service.account.SecurityService;
import com.lordcroci.service.expense.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Controller
public class ExpensesController {

    @Autowired
    private ExpenseService expenseService;

    @Autowired
    private SecurityService securityService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(LocalDate.class, new CustomDateEditor(new SimpleDateFormat("yyyy-DD-mm"), true));
    }

    @RequestMapping(value = "/expCounter", method = RequestMethod.GET)
    public String showExpensesCounter(Model model)
    {
        String userName = securityService.getLoggedUserUsername();
        List<Expense> expenses = expenseService.findAllByUser(userName);
        if(expenses != null)
        {
            Collections.reverse(expenses);
        }
        model.addAttribute("expenses", expenses);

        if (!model.containsAttribute("expForm")) {
            model.addAttribute("expForm", new Expense());
        }
        return "expenses-counter";
    }

    @RequestMapping(value = "/expCounter", method = RequestMethod.POST)
    public String addExpense(@Valid @ModelAttribute("expForm") Expense expense,
        BindingResult result,
        ModelMap model, RedirectAttributes redirectAttributes)
    {
        if(result.hasErrors())
        {
            redirectAttributes.addFlashAttribute("validationResult", result);
            redirectAttributes.addFlashAttribute("expForm", expense);
            return "redirect:expCounter";
        }

        expenseService.save(expense);
        return "redirect:expCounter";
    }
}
