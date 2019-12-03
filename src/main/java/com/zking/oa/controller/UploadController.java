package com.zking.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;


@Controller
public class UploadController {

    private String saveDir="E:\\CentOS\\";

    @RequestMapping("/toUpload")
    public String toUpload(){
        return "upload";
    }

//    public String toUpload(){
//        return "upload2";
//    }

    @PostMapping("/upload")
    public String upload(MultipartFile img1) throws Exception{
        String fileid= UUID.randomUUID().toString().replace("-","");
        File targetFile =new File(saveDir+fileid);
//        System.out.println(img1.getOriginalFilename());
        System.out.println(targetFile);
        img1.transferTo(targetFile);
        return "redirect:/toUpload";
    }

//    @PostMapping("/upload2")
//    public String upload2(MultipartFile[] imgs) throws Exception{
//        for (int i=0;null!=imgs && i<imgs.length;i++){
//            MultipartFile img1=imgs[i];
//            String fileid= UUID.randomUUID().toString().replace("","");
//            File targetFile =new File(saveDir+fileid);
//            System.out.println(img1.getOriginalFilename());
//            img1.transferTo(targetFile);
//        }
//
//        return "redirect:/toUpload";
//    }
}
