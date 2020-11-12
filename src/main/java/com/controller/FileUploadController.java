package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {

    @RequestMapping(value = "/fileUpload")
    public String FileUpload(MultipartFile file, HttpServletRequest request) throws IOException {
        // 如果不为空的话进行保存
        if(!file.isEmpty()) {
            String filename = file.getOriginalFilename(); // 获取原始文件名
            String realPath = request.getServletContext().getRealPath("/images");
            file.transferTo(new File(realPath,filename));
        }
        return "success.jsp";
    }
}
