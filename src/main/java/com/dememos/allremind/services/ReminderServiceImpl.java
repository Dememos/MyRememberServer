package com.dememos.allremind.services;

import com.dememos.allremind.entity.Remind;
import com.dememos.allremind.repositories.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderServes {

    @Autowired
    private RemindRepository remindRepository;


    public List<Remind> getAll() {
        return remindRepository.findAll();
    }

    public Remind getById(long id) {
        return remindRepository.findOne(id);
    }

    public Remind save(Remind remind) {
        return remindRepository.saveAndFlush(remind);
    }

    public void remove(long id) {
        remindRepository.delete(id);
    }
}
