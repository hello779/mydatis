package com.zking.oa.controller;

import com.zking.oa.model.User;
import com.zking.oa.util.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
@RequestMapping("/user")
public class UserController {

    @PostMapping("/reg")
    @ResponseBody
    public JsonData reg(@Validated(User.ValidatedGroups.Reg.class) User user, BindingResult bindingResult){
        log.info("reg...");
        log.info("{}",user);
        JsonData jsonData=new JsonData();
     if(bindingResult.hasErrors()){
         Map<String,String> errors=new HashMap<String,String>();
         List<FieldError> fieldErrors=bindingResult.getFieldErrors();
         for (FieldError e:fieldErrors ) {
             errors.put(e.getField(), e.getDefaultMessage());
         }
         //         return "reg";
         log.info("errors:{}",errors);
         jsonData.setCode(-1);
         jsonData.put("errors:{}",errors);
        }else{
         jsonData.setMessage("注册成功");
     }
        System.out.println(user.toString());
        return jsonData;
    }

    @PostMapping("/login")
    @ResponseBody
    public JsonData login(@Validated(User.ValidatedGroups.Login.class) User user, BindingResult bindingResult){
        log.info("login...");
        log.info("{}",user);

        JsonData jsonData=new JsonData();
        if(bindingResult.hasErrors()){
            Map<String,String> errors=new HashMap<String,String>();
            List<FieldError> fieldErrors=bindingResult.getFieldErrors();
            for (FieldError e:fieldErrors ) {
                errors.put(e.getField(), e.getDefaultMessage());
            }
            log.info("errors:{}",errors);
            jsonData.setCode(-1);
            jsonData.put("errors:{}",errors);
        }else{
            jsonData.setMessage("登录成功");
        }
        System.out.println(user.toString());
        return jsonData;
    }

}
