package com.sai.CrudMongo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class CrudMongoController {
    @GetMapping("/")
    public String sai(Model model){
        model.addAttribute("welcome");
        return "sai";
    }
}

