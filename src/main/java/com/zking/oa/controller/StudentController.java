package com.zking.oa.controller;

import com.zking.oa.model.Student;
import com.zking.oa.service.impl.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @ModelAttribute
    public void init(Model model){
        System.out.println("init....");
        model.addAttribute("classList",new String[]{"ww","22","33"});
        Student student=new Student();
        student.setAge(20);
        model.addAttribute("student",student);
    }


    @RequestMapping("/toAdd")
//    @RequestMapping(value = "/toAdd",method = {RequestMethod.GET,RequestMethod.GET.POST})
//    @GetMapping("/toAdd")
//    @PostMapping("/toAdd")
    public String toAdd(Model model) {
        System.out.println("toAdd");

        String[] classList=(String[])model.asMap().get("classList");
        System.out.println(Arrays.toString(classList));
        return "addStudent";
    }

    @PostMapping("/add")
    public ModelAndView add(ModelAndView modelAndView, Student student, RedirectAttributes redirectAttributes) {
        System.out.println("add");
        System.out.println(student);

        studentService.add(student);

        redirectAttributes.addAttribute("id",110);

        modelAndView.setViewName("redirect:/stu/toAdd");

        return modelAndView;

    }

}
