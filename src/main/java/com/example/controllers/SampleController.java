package com.example.controllers;


import com.example.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/sample")
@Controller
public class SampleController {
    @Autowired
    private SampleService sampleService;
    @RequestMapping(value = {"","/index","/home"},method = RequestMethod.GET    )
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("obj", "Hello World");
        return mv;

    }
    @RequestMapping(value = "/sum/{a}/{b}", method = RequestMethod.GET)
    public ModelAndView sum(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        ModelAndView mv = new ModelAndView("sum");
        mv.addObject("sum", sampleService.Sum(a, b));
        return mv;
    }
    @RequestMapping(value = "/multiply/{a}/{b}", method = RequestMethod.GET)
    public ModelAndView multiply(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        ModelAndView mv = new ModelAndView("multiply");
        mv.addObject("multiply", sampleService.Multiply(a, b));
        return mv;
    }
    @RequestMapping(value = "/cuuchuong/{a}", method = RequestMethod.GET)
    public ModelAndView cuuchuong(@PathVariable("a") Integer a) {
        ModelAndView mv = new ModelAndView("cuuchuong");
        mv.addObject("cuuchuong", sampleService.cuuchuong(a));
        return mv;
    }
}
