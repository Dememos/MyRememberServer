package com.dememos.allremind.controller;


import com.dememos.allremind.entity.Remind;
import com.dememos.allremind.repositories.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/remind")
public class RemindController {

    @Autowired
    private RemindRepository remindRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getRemind() {

        List<Remind> list = remindRepository.findAll();
        return createMockRemind();
    }

    private Remind createMockRemind() {
        Remind remind = new Remind();
        remind.setId(1);
        remind.setRemindDate(new Date());
        remind.setTitle("Hello, world");

        return remind;
    }


}
