package com.lordcroci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/portfolio")
public class PortfolioController
{
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showMainPortfolioPage(Model model)
    {
        return "portfolio-main";
    }

    @RequestMapping(value = "/advancedCss", method = RequestMethod.GET)
    public String showAdvancedCssPage(Model model)
    {
        return "advanced-css";
    }

    @RequestMapping(value = "/bootstrapFour", method = RequestMethod.GET)
    public String showBootstrapFourPage(Model model)
    {
        return "bootstrap-four";
    }
}
