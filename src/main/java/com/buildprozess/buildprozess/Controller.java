package com.buildprozess.buildprozess;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/")
    @ResponseBody
    public String index(){
        return "Hello World!";
    }
}
