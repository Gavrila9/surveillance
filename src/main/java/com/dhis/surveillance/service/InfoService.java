package com.dhis.surveillance.service;

import com.dhis.surveillance.dao.InfoMapper;
import com.dhis.surveillance.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        detailMap.put("Suspend infection cases",infoMapper.suspend_infection_cases());
        detailMap.put("Death infection cases",infoMapper.death_infection_cases());
        detailMap.put("Current cases cords",infoMapper.cords());
        return detailMap;
    }
}
