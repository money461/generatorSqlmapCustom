package com.bondex.mapper;

import com.bondex.pojo.HawbRecordInfo;
import com.bondex.pojo.HawbRecordInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HawbRecordInfoMapper {
    int countByExample(HawbRecordInfoExample example);

    int deleteByExample(HawbRecordInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HawbRecordInfo record);

    int insertSelective(HawbRecordInfo record);

    List<HawbRecordInfo> selectByExample(HawbRecordInfoExample example);

    HawbRecordInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HawbRecordInfo record, @Param("example") HawbRecordInfoExample example);

    int updateByExample(@Param("record") HawbRecordInfo record, @Param("example") HawbRecordInfoExample example);

    int updateByPrimaryKeySelective(HawbRecordInfo record);

    int updateByPrimaryKey(HawbRecordInfo record);
}