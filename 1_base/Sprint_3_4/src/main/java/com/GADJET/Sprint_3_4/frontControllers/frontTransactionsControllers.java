package com.GADJET.Sprint_3_4.frontControllers;

import com.GADJET.Sprint_3_4.frontServices.frontTransactionsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class frontTransactionsControllers {
    @Autowired
    frontTransactionsServices TS2;

    public frontTransactionsControllers(frontTransactionsServices TS2) {

        this.TS2 = TS2;
    }

    @GetMapping("/transactions")
    public String transactions(Model model){
        model.addAttribute("listtransactions", TS2.getAllTransactions());
        return "List_of_Transactions";
    }
}
