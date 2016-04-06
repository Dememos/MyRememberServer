package com.dememos.allremind.controller;


import com.dememos.allremind.entity.Remind;
import com.dememos.allremind.services.ReminderServes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RemindController {

    @Autowired
    private ReminderServes reminderServes;

    @RequestMapping(value = "/reminds", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminds() {

        return reminderServes.getAll();
    }

    @RequestMapping(value = "/reminds/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getRemind(@PathVariable("id") long remindID) {

        return reminderServes.getById(remindID);
    }

    @RequestMapping(value = "/reminds", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveRemind(@RequestBody Remind remind) {

        return reminderServes.save(remind);
    }


    @RequestMapping(value = "/reminds/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void deleteRemind(@PathVariable long id) {

        reminderServes.remove(id);
    }





}
