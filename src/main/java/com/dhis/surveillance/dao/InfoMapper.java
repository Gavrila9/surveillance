package com.dhis.surveillance.dao;

import com.dhis.surveillance.vo.DataVO;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface InfoMapper {
   List<DataVO> queryList();
}
