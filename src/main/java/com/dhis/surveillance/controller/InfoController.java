package com.dhis.surveillance.controller;

import com.dhis.surveillance.service.InfoService;
import com.dhis.surveillance.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InfoController {
    @Autowired
    private InfoService infoService;
    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/init")
    @ResponseBody
    public List<DataVO> queryList(){
        List<DataVO> queryList = infoService.queryList();
        return queryList;
    }
}
