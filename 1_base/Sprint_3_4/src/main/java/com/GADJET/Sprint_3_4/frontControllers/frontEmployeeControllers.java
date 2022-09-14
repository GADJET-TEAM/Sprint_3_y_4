package com.GADJET.Sprint_3_4.frontControllers;

import com.GADJET.Sprint_3_4.services.employeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class frontEmployeeControllers {

    @Autowired
    employeeServices EMPS2;

    @GetMapping("/")
    private String indexEmployee(){
        return "indexEmployee";
    }
}
