package com.dhis.surveillance.controller;

import com.dhis.surveillance.annotation.LoginToken;
import com.dhis.surveillance.service.InfoService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private InfoService infoService;
    @RequestMapping("getCurrentInfectionCasesNumber")
    @ResponseBody
    public int getCurrentInfectionCasesNumber(){
        return infoService.showCurrentInfectionCases();
    }
    @RequestMapping("getCuredInfectionCasesNumber")
    @ResponseBody
    public int getCuredInfectionCasesNumber(){
        return infoService.showCuredInfectionCases();
    }
    @RequestMapping("getDeathInfectionCasesNumber")
    @ResponseBody
    public int getDeathInfectionCasesNumber(){
        return infoService.showDeathInfectionCases();
    }
    @RequestMapping("getSuspectedInfectionCasesNumber")
    @ResponseBody
    public int getSuspectedInfectionCasesNumber(){
        return infoService.showSuspectedInfectionCases();
    }
    @RequestMapping("getTotalInfectionCasesNumber")
    @ResponseBody
    public int getTotalInfectionCasesNumber(){
        return infoService.showTotalInfectionCases();
    }
    @RequestMapping("getMaleInfectionCasesNumber")
    @ResponseBody
    public int getMaleInfectionCasesNumber(){
        return infoService.showMaleInfectionCases();
    }
    @RequestMapping("getFemaleInfectionCasesNumber")
    @ResponseBody
    public int getFemaleInfectionCasesNumber(){
        return infoService.showFemaleInfectionCases();
    }
    @RequestMapping("getMaleFemaleInfectionRatio")
    @ResponseBody
    public String getMaleFemaleInfectionRatio(){
        return infoService.showMaleFemaleInfectionRatio();
    }
    @RequestMapping("getEverydayInfectionNumber")
    @ResponseBody
    public String getEverydayInfectionNumber(){
        List<Map> detailMap = infoService.showEveryDayInfectionCases();
        String jsonResult = new Gson().toJson(detailMap);
        return jsonResult;
    }
    @RequestMapping("getEverydayCuredNumber")
    @ResponseBody
    public String getEveryDayCuredNumber(){
        List<Map> detailMap = infoService.showEveryDayCuredCases();
        String jsonResult = new Gson().toJson(detailMap);
        return jsonResult;
    }
    @RequestMapping("getEverydayDeathNumber")
    @ResponseBody
    public String getEverydayDeathNumber(){
        List<Map> detailMap = infoService.showEveryDayDeathCases();
        String jsonResult = new Gson().toJson(detailMap);
        return jsonResult;
    }

}
