package com.codewithhassan.springbatchtask.batch;

import com.codewithhassan.springbatchtask.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

// Create the item processor
@Component
public class Processor implements ItemProcessor<User, User> {

    // Map the department code to the name od department
    private static final Map<String, String> DEPT_NAMES = new HashMap<>();

    public Processor(){
        DEPT_NAMES.put("001", "Junior Developer");
        DEPT_NAMES.put("002", "Senior Developer");
        DEPT_NAMES.put("003", "Assistant Manager");
        DEPT_NAMES.put("004", "Manager");
        DEPT_NAMES.put("005", "Head Of Department");
    }
    @Override
    public User process(User user) throws Exception {

        String deptCode = user.getDept();
        String dept = DEPT_NAMES.get(deptCode);
        user.setDept(dept);
        System.out.println(String.format("Converted from [%s] to [&s]", deptCode, dept));

        return user;
    }
}
