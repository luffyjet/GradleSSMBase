package com.luffyjet.gweb.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title :
 * Author : luffyjet
 * Date : 2017/5/12
 * Project : gweb001
 * Site : http://www.luffyjet.com
 */
@RestController
public class DemoController {
    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable("name") String name) {
        return "hello " + name;
    }
}
