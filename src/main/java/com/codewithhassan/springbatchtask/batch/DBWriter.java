package com.codewithhassan.springbatchtask.batch;

import com.codewithhassan.springbatchtask.model.User;
import com.codewithhassan.springbatchtask.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

// Create the database writer
@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    // Log statement
    @Override
    public void write(List<? extends User> users) throws Exception {

        System.out.println("Data saved for users: " + users);

        userRepository.saveAll(users);
    }
}
