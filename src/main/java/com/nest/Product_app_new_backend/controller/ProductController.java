package com.nest.Product_app_new_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @PostMapping("/reg")
    public String Reg()
    {
        return "regisrer";
    }

    @PostMapping("/add")
    public String Add()
    {
        return "adding";
    }

    @GetMapping("/view")
    public String View()
    {return "view";
    }

}
