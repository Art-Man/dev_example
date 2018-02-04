package com.yineng.main;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.mp4parser.Box;
//import org.mp4parser.IsoFile;
//import org.mp4parser.boxes.iso14496.part12.MovieBox;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.*;
import java.nio.channels.FileChannel;

/**
 * Created by lds on 2017-11-02
 */
@Controller
@RequestMapping("/")
public class HomeController {
    private static Log log = LogFactory.getLog(HomeController.class);

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(HomeController.class);


    @ResponseBody
    @RequestMapping("/")
    public JsonBean index(){
        JsonBean jsonBean = new JsonBean();
        return jsonBean;
    }




}
