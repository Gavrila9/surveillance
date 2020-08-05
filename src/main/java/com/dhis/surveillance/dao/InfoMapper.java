package com.dhis.surveillance.dao;

import com.dhis.surveillance.vo.DataVO;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
import java.util.Map;

@Mapper
public interface InfoMapper {
   List<DataVO> queryList();
   int current_infection_cases();
   int total_infection_cases();
   int cured_infection_cases();
   int suspected_infection_cases();
   int death_infection_cases();
   List<Map> cords();
}
