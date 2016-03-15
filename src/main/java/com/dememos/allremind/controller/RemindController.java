package com.dememos.allremind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hell")
public class RemindController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getRemind(ModelMap model) {
        return "Can you help me?";
    }


}
