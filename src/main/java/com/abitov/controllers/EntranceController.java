package com.abitov.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EntranceController {

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String entrance(){
        return "entrance";
    }

}
