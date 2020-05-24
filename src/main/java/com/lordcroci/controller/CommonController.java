package com.lordcroci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController
{
    @RequestMapping(value={"/", "/index"}, method = RequestMethod.GET)
    String getIndex(Model model)
    {
        return "index";
    }
}
