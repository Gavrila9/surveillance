package com.dhis.surveillance.controller;

import com.dhis.surveillance.annotation.LoginToken;
import com.dhis.surveillance.service.InfoService;
import com.dhis.surveillance.vo.DataVO;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;
import java.util.Map;

@Controller
public class InfoController {
    @Autowired
    private InfoService infoService;
    @LoginToken
    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }
    @LoginToken
    @RequestMapping("/init")
    @ResponseBody
    public String queryList(){
        List<DataVO> queryList = infoService.queryList();
        String jsonResult = new Gson().toJson(queryList);
        return jsonResult;
    }

    @RequestMapping("/showDetails")
    @ResponseBody
    public String showDetails(){
        Map detailMap = infoService.showDeatils();
        String jsonResult = new Gson().toJson(detailMap);
        return jsonResult;
    }
}
