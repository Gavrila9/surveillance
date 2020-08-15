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
   int male_infection_cases();
   int female_infection_cases();
   List<Map> cords();
   List<Map> everyday_infection_cases();
   List<Map> everyday_death_cases();
   List<Map> everyday_cured_cases();
}
