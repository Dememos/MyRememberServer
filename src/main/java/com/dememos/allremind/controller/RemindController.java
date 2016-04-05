package com.dememos.allremind.controller;


import com.dememos.allremind.entity.Remind;
import com.dememos.allremind.repositories.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RemindController {

    @Autowired
    private RemindRepository remindRepository;

    @RequestMapping(value = "/reminds", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminds() {

        return remindRepository.findAll();
    }

    @RequestMapping(value = "/reminds/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getRemind(@PathVariable("id") long remindID) {

        return remindRepository.findOne(remindID);
    }

    @RequestMapping(value = "/reminds", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveRemind(@RequestBody Remind remind) {

        return remindRepository.saveAndFlush(remind);
    }


    @RequestMapping(value = "/reminds/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void deleteRemind(@PathVariable long id) {

        remindRepository.delete(id);
    }





}
