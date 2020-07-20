package com.dhis.surveillance.service;

import com.dhis.surveillance.dao.InfoMapper;
import com.dhis.surveillance.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("InfoService")
public class InfoService {
    @Autowired
    private InfoMapper infoMapper;

    public List<DataVO> queryList(){
        List<DataVO> queryList = infoMapper.queryList();
        return queryList;
    }
}
