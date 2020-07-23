package com.dhis.surveillance.controller;

import com.dhis.surveillance.service.InfoService;
import com.dhis.surveillance.vo.DataVO;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class InfoController {
    @Autowired
    private InfoService infoService;
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/init")
    @ResponseBody
    public String queryList(){
        List<DataVO> queryList = infoService.queryList();
        String jsonResult = new Gson().toJson(queryList);
        return jsonResult;
    }
}
