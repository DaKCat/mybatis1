package com.zking.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Controller
public class UploadController {

    private String saveDir = "e:\\temp\\";

    @RequestMapping("/toUpload")
    public String toUpload() {
        return "upload";
    }

    @RequestMapping("/upload")
    public String upload(MultipartFile img) throws Exception {
        String fileId = UUID.randomUUID().toString().replace("-", "");
        File targetFile = new File(saveDir + fileId);
        System.out.println(img.getOriginalFilename());
//        String fileName = img.getOriginalFilename();
        img.transferTo(targetFile);
        return "redirect:/toUpload";
    }

    @RequestMapping("/upload2")
    public String upload2(MultipartFile[] imgs) throws Exception {
        for (int i = 0; null != imgs && i < imgs.length; i++) {
            MultipartFile img=imgs[i];
            String fileId = UUID.randomUUID().toString().replace("-", "");
            File targetFile = new File(saveDir + fileId);
            System.out.println(img.getOriginalFilename());
//        String fileName = img.getOriginalFilename();
            img.transferTo(targetFile);
        }

        return "redirect:/toUpload";
    }
}
