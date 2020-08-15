package com.dhis.surveillance.service;

import com.dhis.surveillance.dao.InfoMapper;
import com.dhis.surveillance.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("InfoService")
public class InfoService {
    @Autowired
    private InfoMapper infoMapper;

    public List<DataVO> queryList(){
        List<DataVO> queryList = infoMapper.queryList();
        return queryList;
    }

    public Map<String,String> showDeatils(){
        Map detailMap = new HashMap();
        detailMap.put("Current infection cases",infoMapper.current_infection_cases());
        detailMap.put("Total infection cases",infoMapper.total_infection_cases());
        detailMap.put("Cured infection cases",infoMapper.cured_infection_cases());
        detailMap.put("Suspected infection cases",infoMapper.suspected_infection_cases());
        detailMap.put("Death infection cases",infoMapper.death_infection_cases());
//        detailMap.put("Current cases cords",infoMapper.cords());
        detailMap.put("Male infection cases",infoMapper.male_infection_cases());
        detailMap.put("female infection cases", infoMapper.female_infection_cases());
        detailMap.put("Male and female infection ratio",showMaleFemaleInfectionRatio());
        detailMap.put("Everyday infection cases",infoMapper.everyday_infection_cases());
        return detailMap;
    }
    public int showCurrentInfectionCases(){
        return infoMapper.current_infection_cases();
    }
    public int showTotalInfectionCases(){
        return infoMapper.total_infection_cases();
    }
    public int showCuredInfectionCases(){
        return infoMapper.cured_infection_cases();
    }
    public int showSuspectedInfectionCases(){
        return infoMapper.suspected_infection_cases();
    }
    public int showDeathInfectionCases(){
        return infoMapper.death_infection_cases();
    }
    public int showMaleInfectionCases(){
        return infoMapper.male_infection_cases();
    }
    public int showFemaleInfectionCases(){
        return infoMapper.female_infection_cases();
    }
    public String showMaleFemaleInfectionRatio(){
        double Ratio =  (double)(infoMapper.male_infection_cases()/infoMapper.female_infection_cases())*100;
        java.math.BigDecimal b = new java.math.BigDecimal(Ratio);
        String result = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue() + "%";
        return result;
    }
    public List<Map> showEveryDayInfectionCases(){
        return infoMapper.everyday_infection_cases();
    }
    public List<Map> showEveryDayDeathCases(){
        return infoMapper.everyday_death_cases();
    }
    public List<Map> showEveryDayCuredCases(){
        return infoMapper.everyday_cured_cases();
    }

}
