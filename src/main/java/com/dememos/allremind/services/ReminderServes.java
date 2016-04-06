package com.dememos.allremind.services;


import com.dememos.allremind.entity.Remind;

import java.util.List;

public interface ReminderServes {

    List<Remind> getAll();
    Remind getById(long id);
    Remind save(Remind remind);
    void remove(long id);



}
